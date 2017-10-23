package javaclass;

import java.util.*;

class A
{
	private int x;
	Scanner sc= new Scanner(System.in);
	
	public void f1()
	{
		System.out.println("Enter integer: ");
		x=sc.nextInt();
	}
	
	public void display()
	{
		System.out.println("u enter: " + x);;
	}
}
public class DemoMain {

	public static void main(String[] args) {
		A ob1 = new A();
		ob1.f1();
		ob1.display();

	}

}
