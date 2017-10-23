package com.eception.example;

class Demo
{
	int arr[] = new int[5];
	int x,y;
	
	public void f1()
	{
		try
		{
			System.out.println("Before Exception f1");
			arr[10]=500;
			x=5/0;
			System.out.println("After Exception f1");
		}catch(ArithmeticException e)
			{
				//catch body
				System.out.println("Error Occur f1");
			}
		catch(Exception e)
		{
			System.out.println("another catch f1");
			
		}
		System.out.println("outside try block f1");
		
	}
	
	public void f2()
	{
		try
		{
			System.out.println("Before f2");
			y=10/0;
			System.out.println("Inside F2");
		}
		catch(Exception e)
		{
			System.out.println("exception in f2");
		}
		finally  //when error occurs then this bolck is exceuted then prog terminate
		{
			System.out.println("good luck f2");
		}
	}
	
}




public class ExceptionMain 
{

	public static void main(String[] args) 
	{
		Demo obj = new Demo();
		//obj.f1();
		obj.f2();
		obj.f1();

	}

}
