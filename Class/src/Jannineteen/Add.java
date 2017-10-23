package Jannineteen;

import java.util.Scanner;

public class Add {
	
	private int firstno,second,result;
	
	private Scanner sc=new Scanner(System.in);
	
	public Add()
	{
		firstno=0;
		second=0;
	}
	
	public Add(int firstno, int second) {
		this.firstno = firstno;
		this.second = second;
	}
	public void inputValue()
	{
		System.out.println("Enter 1st no: ");
		firstno=sc.nextInt();
		System.out.println("Enter 2nd no: ");
		second=sc.nextInt();
	}
	public void calculation()
	{
		result=firstno+second;
	}
	public void display()
	{
		System.out.println(firstno+" + "+second+" = "+result);
	}
}
