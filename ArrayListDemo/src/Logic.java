import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Logic
{
	 
	
	 private Scanner sc = new Scanner(System.in);
	 private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
	 ArrayList<Input> student = new ArrayList<Input>();
	 
	 public void userInput() throws IOException
	 {
		 String ch;
		 System.out.println("enter details: ");
		 do
		 {
			 Input ob = new Input();
			  ob.setRollNo(sc.nextInt());
			  ob.setName(br.readLine());
			  ob.setMarks(sc.nextDouble());
			 student.add(ob);
			 ch = sc.next();
		 }while(ch.equalsIgnoreCase("y"));
	 }
	 
	 public void display()
	 {
		 for(Input e: student)
		 {
			 System.out.println("Roll: "+e.getRollNo());
			 System.out.println("Name: "+e.getName());
			 System.out.println("Marks: "+e.getMarks());
		 }
	 }
}
