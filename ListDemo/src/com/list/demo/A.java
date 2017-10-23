package com.list.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import java.awt.List;

public class A {
	
	
	List<Integer> list = new ArrayList<Integer>();
	
	Scanner sc = new Scanner(System.in);
	
	private String reply="";
	
	public void userInput()
	{
		do
		{
			System.out.println("Enter any Integer");
			list.add(sc.nextInt());
			reply = sc.next();
			System.out.println("Add more (Y/N)");
		}while(reply.equalsIgnoreCase("y"));
	}
	
	public void display()
	{
		C.display(list);
	}
	
}
