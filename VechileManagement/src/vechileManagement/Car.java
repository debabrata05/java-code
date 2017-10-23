package vechileManagement;

import java.util.Scanner;

public class Car extends Vechile
{
	CarInput ci = new CarInput();
	
	Scanner sc = new Scanner(System.in);
	
	public Car()
	{
		System.out.println("\n Car \n");
	}
	
	public void noOfPassenger()
	{
		super.detailOfVechile();
		System.out.println("Enter number of passenger a car have: ");
		ci.setNoOfPassenger(sc.nextInt());
	}
	
	public void display()
	{
		super.display();
		System.out.println("Number of passenger: "+ci.getNoOfPassenger());
		
	}

}
