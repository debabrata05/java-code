import java.util.Scanner;

class Check
{
	private Scanner sc = new Scanner(System.in);
		
    void nameCheck()
    {
    	String namepattern = "^[a-zA-Z]{3,5}$";
    	
    	System.out.println("Enter Name");
    	String name = sc.next();
    	
    	@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(name);
    	
    	String match = sc1.findInLine(namepattern);  //if mismatch occur then it will return null
    	
    	if (match == null)
    	{
    		System.out.println("Please Enter Valid Name");
    		nameCheck();
    	}
    	else
    		System.out.println("Correct");
    }
    
    void emilcheck()
    {
    	//in C to print "hi" we write printf("\"hi\"") and this is called escape syntax
    	// printf("\\\") -> \\ and printf("\\\\") -> \\
    	String emailpattern = "^(\\w)+@(\\w+\\.)(\\w+\\.)?[a-z]+$";
    	// '+' -> this means atleast 1 should be there
    	// '[...]' -> represents grouping 
    	// '?' -> whatever after this sign shows that may or may not be appear 
    	System.out.println("Enter EmailId");
    	String email = sc.next();
    	
    	@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(email);
    	
    	String match1 = sc2.findInLine(emailpattern);
    	
    	if (match1 == null)
    	{
    		System.out.println("Please Enter Valid Email");
    		emilcheck();
    	}
    	else
    		System.out.println("Correct");
    }
    
    void pincodecheck()
    {
    	String pinpattern = "^[0-9]{6}$";
    	
    	System.out.println("Enter Pincode");
    	String pincode = sc.next();
    	
    	@SuppressWarnings("resource")
		Scanner sc3 = new Scanner(pincode);
    	
    	String match2 = sc3.findInLine(pinpattern);
    	
    	if (match2 == null)
    	{
    		System.out.println("Please Enter Valid Pincode");
    		pincodecheck();
    	}
    	else
    		System.out.println("Correct");
    }
    

}

// '\d' -> "0-9" and '\w' -> "a-z, A-Z, 0-9, _ "

public class Validation 
{
	public static void main(String[] args) 
	{
		Check c1 = new Check();
		c1.nameCheck();
		c1.emilcheck();
		c1.pincodecheck();

	}

}
