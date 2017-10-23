package com.list.demo;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class B {
	
	List<Integer> arrlist = new LinkedList<Integer>();
	
	/*LinkedList<Integer> list1 = new LinkedList<Integer>();*/
	
	Scanner sc = new Scanner(System.in);
	
	private String reply="";
	
	/*public void fun()
	{
	
	}*/
	
	public void userInput()
	{
		do
		{
			System.out.println("Enter any Integer");
			arrlist.add(sc.nextInt());
			reply = sc.next();
			System.out.println("Add more (Y/N)");
		}while(reply.equalsIgnoreCase("y"));
	}
	
	
	public void display()
	{
		C.display(arrlist);
	}

}
