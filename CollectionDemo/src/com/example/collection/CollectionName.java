package com.example.collection;

//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class ListDemo
{
	Scanner sc = new Scanner(System.in);
	//ArrayList<String> alist = new ArrayList<String>();
	//ArrayList<ClassName> e.g ArrayList<Integer>
	ArrayList<Integer> alist1 = new ArrayList<Integer>();
	
	List<Integer> alist1l = new ArrayList<Integer>();
	
	LinkedList<Integer> alist2LL = new LinkedList<Integer>();
	
	String reply = "";
	
	
	public void userInput()
	{
		do
		{
			//System.out.println("Enter Any String: ");
			System.out.println("Enter any Integer");
			//alist.add(sc.next());
			alist1l.add(sc.nextInt());
			
			System.out.println("Add more (Y/N)");
			reply = sc.next();
		}while(reply.equalsIgnoreCase("y"));
		//alist1=(ArrayList<Integer>) alist1l;
		display(alist1l);
	}
	
	
	/*private void display(List<Integer> alist1l2) {
		// TODO Auto-generated method stub
		
	}*/


	public void userInputLL()
	{
		do
		{
			//System.out.println("Enter Any String: ");
			System.out.println("Enter any Integer");
			//alist.add(sc.next());
			alist1l.add(sc.nextInt());
			
			System.out.println("Add more (Y/N)");
			reply = sc.next();
		}while(reply.equalsIgnoreCase("y"));
		//alist1l=alist2LL;
		display(alist1l);
	}
	
	
	public void del()
	{
		//alist.remove(1);
		//alist.add(1,"new");
		System.out.println("Enter no u want to delete: ");
		int no = sc.nextInt();
		//alist.set(1, "new");
		alist2LL.remove(no); //it take "no" as an idex value instead of value
		
	}
	
	public void display(List<Integer> al)
	{
		System.out.println("U enter: ");
		/*for(String ss: alist)
		{
			System.out.println(ss+"\n size of array"+alist.size());
		}*/
		
		for(Integer ss: al)
		{
			System.out.println(ss);
		}
	}
	
	
	
}

public class CollectionName 
{
	public static void main(String[] agrs)
	{
		ListDemo obj = new ListDemo();
		obj.userInput();
		//obj.userInputLL();
		//obj.display();
		//System.out.println("After delete");
		//obj.del();
		//obj.display();
	}

}
