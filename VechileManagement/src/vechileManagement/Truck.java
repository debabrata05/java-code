package vechileManagement;

import java.util.Scanner;

public class Truck extends Vechile 
{

	TruckInput ti = new TruckInput();
	
	Scanner sc = new Scanner(System.in);
	
	public Truck()
	{
		System.out.println("\n Truck \n");
	}
	
	public void load()
	{
		super.detailOfVechile();
		System.out.println("Enter the amount of load a truck have: ");
		ti.setLoadLimit(sc.nextDouble());
	}
	
	public void display()
	{
		super.display();
		System.out.println("Load Limit : "+ti.getLoadLimit());
		
	}
	
}
