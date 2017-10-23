import java.util.Scanner;
import java.io.*;

public class Details 
{
	private int roll_no,CMarks,javaMarks,no_of_students,searchRoll,avg1,avg2,ch;
	private String name;
	private Details student[],temp,rn;
	
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private Scanner ip=new Scanner(System.in);
	
	public void noOfStudents()
	{
		System.out.println("Enter the reccord size: ");
		no_of_students=ip.nextInt();
	}
	
	public void studentsArrCreation()
	{
		student=new Details[no_of_students];
	}
	
	public void getData() throws IOException
	{
		for(int i=0;i<student.length;i++)
		{
			student[i]=new Details();
			System.out.println("Enter the Roll number of student "+(i+1)+" : ");
			student[i].roll_no=ip.nextInt();
			System.out.println("Enter the name of student "+(i+1)+" : ");
			student[i].name=br.readLine();
			System.out.println("Enter the C marks of student "+(i+1)+" : ");
			student[i].CMarks=ip.nextInt();
			System.out.println("Enter the java marks of student "+(i+1)+" : ");
			student[i].javaMarks=ip.nextInt();
			System.out.println("\n\n");
		}
	}
	
	public void displayDetailsAccordingToRoll()
	{
		for(int i=0;i<student.length;i++)
		{
			for(int j=0;j<student.length;j++)
			{
				if(student[j].roll_no>student[i].roll_no)
				{
					temp=student[i];
					student[i]=student[j];
					student[j]=temp;
				}
			}
		}
	}
	
	public Details marksOfParticularStudent(int x)
	{
		for(Details e: student)
		{
			if(e.roll_no==x)
			{
				rn=e;
				break;
			}
		}
		return rn;
	}
	
	public int enterRollNo()
	{
		System.out.println("Enter roll number of any student: ");
		searchRoll=ip.nextInt();
		return searchRoll;
	}
	
	public void listOfStudentsAccordingToAverageMarks()
	{
		for(int i=0;i<student.length;i++)
		{
			avg1=(student[i].CMarks+student[i].javaMarks)/2;
			for(int j=0;j<student.length;j++)
			{
				avg2=(student[j].CMarks+student[j].javaMarks)/2;
				if(avg1>avg2)
				{
					temp=student[i];
					student[i]=student[j];
					student[j]=temp;
				}
			}
		}
	}
	
	public void display()
	{
		for(Details e: student)
		{
			System.out.println("Name      : "+e.name);
			System.out.println("C Marks   : "+e.CMarks);
			System.out.println("Java Marks: "+e.javaMarks);
			System.out.println("\n\n");
		}
	}
	
	public void display(Details a)
	{
		System.out.println("C Marks   : "+a.CMarks);
		System.out.println("Java Marks: "+a.javaMarks);
	}
	
	public void enterChoice()
	{
		System.out.println("\n\n");
		System.out.println("0. To exit. ");
		System.out.println("1. To see the details of all students according to roll number. ");
		System.out.println("2. To see the C marks and java marks of a particular student. ");
		System.out.println("3. To see the details of all students according to average marks. ");
		System.out.println("\n\n");
		System.out.println("Enter your choice: ");
		ch=ip.nextInt();
		
		switch(ch)
		{
			case 0: break;
			case 1:	displayDetailsAccordingToRoll();
					display();
					enterChoice();
					break;
			case 2: int y=enterRollNo();
					Details b=marksOfParticularStudent(y);
					display(b);
					enterChoice();
					break;
			case 3: listOfStudentsAccordingToAverageMarks();
					display();
					enterChoice();
					break;
			default: System.out.println("Invalid Input");
					 enterChoice();
					 break;
		}
	}
}
