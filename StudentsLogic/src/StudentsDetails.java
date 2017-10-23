import java.io.IOException;

public class StudentsDetails
{
	
	public static void main(String[] args) throws IOException 
	{
		Details ob=new Details();
		System.out.println("Enter students details:  \n\n");
		ob.noOfStudents();
		ob.studentsArrCreation();
		ob.getData();
		ob.enterChoice();

	}

}
