import java.util.*;

public class TolBooth 
{
	
	private TolBoothInput tl=new TolBoothInput();

	private Scanner sc=new Scanner(System.in);
	
	public void noOfCarPass()
	{
		System.out.println("Enter the number of car Passed from Tolbooth and paid: ");
		tl.setCarWhoPaid(sc.nextInt());
		System.out.println("Enter the number of car Passed from Tolbooth but not paid");
		tl.setCarWhoNotPaid(sc.nextInt());
		
	}
	
	public void payingCar()
	{
		tl.setTotalNoOfCars(tl.getTotalNoOfCars() + tl.getCarWhoPaid());
		tl.setTotalAmount(tl.getTotalAmount() + (tl.getCarWhoPaid() * 50));
		
	}
	
	public void noPayingCar()
	{
		tl.setTotalNoOfCars(tl.getTotalNoOfCars() + tl.getCarWhoNotPaid());
	
	}
	
	public void display()
	{
		System.out.println("Total number of car passed from Tolbooth  : "+tl.getTotalNoOfCars());
		System.out.println("Total amount of money collected           : "+tl.getTotalAmount());
		
	}
	
}
