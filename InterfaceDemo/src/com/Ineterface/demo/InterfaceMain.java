package com.Ineterface.demo;

class B  //within class we can make interface this is called nested interface
{
	interface i1
	{
		void f1();
	
	}
}

@FunctionalInterface //function interface used to implement lambda expression; if we write two method in this case then it show error
interface i2 
{
	void f2();
}

//the interface which contain only one method then it will become functional interface; e.g i2
//the interface which does not contain any method is called Marker interface; Generally system define interface r marker interface; e.g serlizable
interface i3  //normal interface
{
	void f3();
	void f4();
}

//implement serializable ; use when we have to send code from one machine to another machine; it is called marker interface

class A implements B.i1
{

	@Override  //annotation
 	//if we remove this @Override then class will give error
	public void f1() 
	{
		System.out.println("Hi");
		
	}
	
	public void f2()
	{
		System.out.println("Hello");
	}
	
}

public class InterfaceMain {

	public static void main(String[] args) 
	{
		//i1 ref = new i1(); <- give error cause interface has no object creation
		// i1 ref = new A();  //this is valid 
		 
		 //ref.f1();

	}

}
