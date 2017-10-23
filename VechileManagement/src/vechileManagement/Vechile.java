package vechileManagement;

import java.util.Scanner;

public class Vechile
{
	VechileInput vi = new VechileInput();
	
	Scanner sc = new Scanner(System.in);
	
	public void detailOfVechile()
	{
		System.out.println("Enter the Number of wheels: ");
		vi.setNoOfWheel(sc.nextInt());
		System.out.println("Enter the Speed: "); 
		vi.setSpeed(sc.nextDouble());
	}
	
	public void display()
	{
		System.out.println("number of wheel: "+vi.getNoOfWheel());
		System.out.println("Speed: "+vi.getSpeed());
		
	}
}
