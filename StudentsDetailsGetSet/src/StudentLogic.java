import java.util.Scanner;

public class StudentLogic 
{
	Scanner sc = new Scanner(System.in);
	
	StudentInfo[] studentarray = new StudentInfo[1];
	
	public void userInput()
	{
		for(int i=0;i<studentarray.length; i++)
		{
			//Create object & store it within Array
			studentarray[i] = new StudentInfo();
			
			//Take Input From user & store within the Object
			System.out.println("Enter roll no");
			studentarray[i].setRollno(sc.nextInt());
			
			System.out.println("Enter C Marks");
			studentarray[i].setCmarks(sc.nextDouble());
			
			System.out.println("Enter Java Marks");
			studentarray[i].setJavamarks(sc.nextDouble());
			
			System.out.println("Enter Name");
			studentarray[i].setName(sc.next());
		}
	}
	
	public void displayInfo()
	{
		for(StudentInfo sobj : studentarray)
		{
			System.out.print("Roll no is "+ sobj.getRollno());
			System.out.print("   Name is "+ sobj.getName());
			System.out.print("   C Marks is "+ sobj.getCmarks());
			System.out.print("   Java Marks is "+ sobj.getJavamarks());
		}
		
	}


}
