package com.set.demo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

//import javax.xml.validation.SchemaFactoryConfigurationError;

class A
{
	HashSet<Integer> hs1 = new HashSet<Integer>();
	TreeSet<Integer> ts1 = new TreeSet<Integer>();
	
	Scanner sc = new Scanner(System.in);
	
	void input()
	{
		for(int i=0; i<3; i++)
		{
			System.out.println("Enter value for Hash Set: ");
			hs1.add(sc.nextInt());
		}
		System.out.println("\n\n");
		for(int i=0; i<3; i++)
		{
			System.out.println("Enter value for Tree Set: ");
			ts1.add(sc.nextInt());
		}
	}
	
	void display()
	{
		System.out.println("Hash set output: ");
		for(Integer h: hs1)
		{
			System.out.println(h);
		
		}
		
		System.out.println("\n\n");
		
		System.out.println("Tree set output: ");
		for(Integer t: ts1)
		{
			System.out.println(t);
		}
		
	}
}

public class SetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob = new A();
		ob.input();
		ob.display();
		
	}

}
