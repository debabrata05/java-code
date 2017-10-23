package com.eception.example;

@SuppressWarnings("serial")
class A1 extends Exception
{
	
	private String msg;
	
	public A1(String msg)
	{
		this.msg=msg;
	}
	
	public String getMsg()
	{
		return msg;
	}
}


class B1
{
	public void f1() throws A1 //in this method if exception is occur then if exception occur then the object which creates it return that object
	//to where from it call
	// we can also write "f1() throws A1,A2,AIOBE,ArithemeticException"
	// now after use this we can also use try catch block then this "throws A1" will not exceute
	//if system define exception is generate then "thorws A1" this will not affect cause by default it create object and if it is user defined 
	//then we have to write "Throws A1" else it will not work
	
	{
		System.out.println("Before");
		
		throw new A1("User defined");
	}
}


public class Main1 
{

	public static void main(String[] args)
	{
		try
		{
			B1 obj = new B1();
			obj.f1();
			
		}
		catch(A1 e)
		{
			System.out.println("Inside Catch "+e.getMsg());
		}

	}

}
