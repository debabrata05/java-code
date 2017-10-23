package com.Ineterface.demo;

import java.util.Scanner;

class Example
{
	private String s1;
	
	Scanner sc = new Scanner(System.in);
	public void display()
	{
		
		String s4 = "Hello";
		String s5 = "Hello";
		String s6 = new String("Hello");
		String s7 = new String("Hello");
		//for s6 it will allocate memory and inside that "Hello" is present same for s7
		//for s4 and s5 one memory is create and that store "Hello" but if we create String s8= "hi"; then for s8 it create another space 
		//that means if both strings are same then it will allocate single memory space 
		
		if(s6==s7) // '==' check weather both object pointing to same memory address or not
			System.out.println("Matched");
		else
			System.out.println("Not matched");

		
		if(s4==s5) // '==' check weather both object pointing to same memory address or not
			System.out.println("Matched");
		else
			System.out.println("Not matched");

		
		if(s6==s4) // '==' check weather both object pointing to same memory address or not
			System.out.println("Matched");
		else
			System.out.println("Not matched");
		
		
		
		if(s6.equals(s7)) // '.equals or .equalsIgnoreCase' check weather both object have same string or not
			System.out.println("Matched");
		else
			System.out.println("Not matched");
		
		
		if(s4.equals(s5)) // '.equals or .equalsIgnoreCase' check weather both object have same string or not
			System.out.println("Matched");
		else
			System.out.println("Not matched");
		
		
		if(s6.equals(s4)) // '.equals or .equalsIgnoreCase' check weather both object have same string or not
			System.out.println("Matched");
		else
			System.out.println("Not matched");
		
		
		
		
		System.out.println(s4.concat(s5)); //string concatenation
		
		
		
		System.out.println("Enter Name: ");
		s1= sc.nextLine();
		
		String s2 = s1.substring(1, 3); //give the output from string position 1 to 2
		// we can also write s2=s1.substring(1) ; from 1 it show whole string
		System.out.println(s2);
		
		System.out.println("Enter Your EmailID");
		String s3 = sc.next();
		
		int i = s3.indexOf('@'); // if this Character is present in the string then it will return its position else it return -1
		if(i<0)
			System.out.println("Invalid Email");
		else
			System.out.println("Valid Email");
		
		System.out.println(s1.length());
		//string length is function and array length is a variable
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		char ch = s1.charAt(2);
		System.out.println(ch);
		
		
		System.out.println(s1);

	
	
		String s9 = "Hello";
		//string is immutable thats why reserve is not available in string
		s9=s9+"rev"; //for this s9 now point to another location
		System.out.println(s9);
		
		
		
		StringBuffer s8 = new StringBuffer("Hello"); //it store 'Hello' and extra 16 bit allocate for this
		
		s8.append("dev"); //its store Hello + 16 bit + dev in memory
	
		
		
		
		
		//how we convert string to string buffer
		 String s10 = new String("Bye");
		 StringBuffer s11 = new StringBuffer(s10);
		 s11.reverse();
		 System.out.println(s11);
		 
		//and if we give the object of string buffer into string then it will convert into string
		 //always it allocate 16 bit
		
	}
	
}



public class StringDemo {

	public static void main(String[] args) 
	{
		Example eg = new Example();
		eg.display();

	}

}
