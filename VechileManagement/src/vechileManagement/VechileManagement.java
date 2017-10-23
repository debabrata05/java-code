package vechileManagement;

public class VechileManagement {

	public static void main(String[] args) 
	{
		Car c = new Car();
		
		c.noOfPassenger();
		c.display();
		
		Truck t = new Truck();
		
		t.load();
		t.display();
	}

}
