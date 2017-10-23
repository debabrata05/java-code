package com.eception.example;

//user define execption class

@SuppressWarnings("serial")
class A extends Exception
{
	//A is a user define Exception class
	private String msg;
	public A(String msg)
	{
		this.msg=msg;
	}
	
	public String getMsg()
	{
		return msg;
	}
}


class B
{
	public void f1()
	{
		try
		{
		System.out.println("Before");
		throw new A("user define"); //using "throw" programmer intentially crate a exception object
		//throw create any exception class object
		//here we dont know the name of the object so it will call the constructor of "A" class
		//using throw we cant create either system define or userdefined exception class
		//System.out.println("After"); //this line give error because after exception no statement will exceute 
		}
		catch(A e)
		{
			System.out.println("Inside catch "+e.getMsg());
		}
		catch(Exception e)
		{
			//System.out.println("Inside catch "+e.getMsg()); //this will not work cause we create user defined exception object and call method of system defined
			System.out.println("Inside catch");
		}
	}
}


public class Main 
{

	public static void main(String[] args) 
	{
		B obj = new B();
		obj.f1();

	}

}
