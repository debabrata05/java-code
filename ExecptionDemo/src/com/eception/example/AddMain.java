package com.eception.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Addition
{
	private int firstno,secondno,result;
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public void userInput() throws IOException
	{
		System.out.println("Enter 1st number: ");
		firstno=Integer.parseInt(br.readLine());
		
		System.out.println("Enter 2nd number: ");
		secondno=Integer.parseInt(br.readLine());
	}
	
	public void calc()
	{
		result = firstno + secondno;
	}
	
	public void disp()
	{
		System.out.println("Sum = "+result);
	}
	
}


public class AddMain 
{

	public static void main(String[] args) throws IOException 
	{
		Addition obj = new Addition();
		obj.userInput();
		obj.calc();
		obj.disp();

	}

}
