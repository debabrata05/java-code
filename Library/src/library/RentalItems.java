package library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RentalItems {
	
	private RentalItemType rit = new RentalItemType();
	
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private Scanner sc = new Scanner(System.in);
	
	public void RentalTypeInput() throws IOException
	{
		System.out.println("Enter 1 for cd.");
		System.out.println("Enter 2 for book ");
		System.out.println("Enter 0 to finish ");
		System.out.println("Enter your choice: ");
		
		int ch = sc.nextInt();
		switch(ch)
		{
			case 0: break;
			case 1:	System.out.println("Number of copies: ");
					rit.setNoOfCopies(sc.nextInt());
					System.out.println("Name: ");
					rit.setName(br.readLine());
					System.out.println("Author Name: ");
					rit.setAuthorName(br.readLine());
					RentalTypeInput();
					break;
			case 2:	System.out.println("Number of copies: ");
					rit.setNoOfCopies(sc.nextInt());
					System.out.println("Name: ");
					rit.setName(br.readLine());
					RentalTypeInput();
					break;
			default: System.out.println("Invalid Input!! ");
					 RentalTypeInput();
					
		}
	}

}
