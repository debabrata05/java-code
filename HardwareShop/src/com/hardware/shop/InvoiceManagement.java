package com.hardware.shop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InvoiceManagement 
{
	private int flag=0;

	private InvoiceInput ii = new InvoiceInput();
	private InvoiceInput in[];
	
	
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private Scanner sc = new Scanner(System.in);
	
	public InvoiceManagement()
	{
		ii.setPartNo(null);
		ii.setPartDescription(null);
		ii.setQuantity(0);
		ii.setPrice(0.0);
		
	}
	
	public void noOfMachine()
	{
		System.out.println("how many machine u have: ");
		ii.setNoOfMachine(sc.nextInt());
		
	}
	
	public void arrayCreation()
	{
		noOfMachine();
		in = new InvoiceInput[ii.getNoOfMachine()];
		
	}
	
	public void invoiceInput() throws IOException
	{
		arrayCreation();
		for(int i=0; i<ii.getNoOfMachine(); i++)
		{
			in[i] = new InvoiceInput();
			System.out.println("Part Number: ");
			in[i].setPartNo(sc.next());
			System.out.println("Part Description: ");
			in[i].setPartDescription(br.readLine());
			System.out.println("Quantity: ");
			in[i].setQuantity(sc.nextInt());
			System.out.println("Price: ");
			in[i].setPrice(sc.nextDouble());
			System.out.println("\n");
		}
		
	}
	
	public void getInvoiceAmount()
	{
		System.out.println("Which Machine u Reqired: ");
		ii.setRequiredMachine(sc.next());
		for(InvoiceInput e : in)
		{
			if(ii.getRequiredMachine().equals(e.getPartNo()));
			{
				System.out.println("Quantity u required: ");
				ii.setRequiredQuantity(sc.nextInt());
				if(ii.getRequiredQuantity()<=e.getQuantity())
				{
					ii.setAmount(ii.getRequiredQuantity() * e.getPrice());
					e.setQuantity(e.getQuantity() - ii.getRequiredQuantity());
					flag=1;
		
				}
				break;
			}
			
		}
		
	}
	
	public void display()
	{
		int choice;
		System.out.println("\n \n");
		System.out.println("0. To exit");
		System.out.println("1. To see hardware details present in shop.");
		System.out.println("2. To get total amount to paid while buying. ");
		System.out.println("\n Enter Your Choice: ");
		choice=sc.nextInt();
		
		switch(choice)
		{
			case 0: break;
			case 1: for(InvoiceInput e: in)
					{
						System.out.println("Part Number: "+ e.getPartNo());
						System.out.println("Part Description: "+e.getPartDescription());
						System.out.println("Quantity Available: "+e.getQuantity());
						System.out.println("Price per Item: "+e.getPrice());
						System.out.println("\n \n");
					}
					display();
					break;
			case 2: getInvoiceAmount();
					if(flag==1)
					{
						System.out.println("Required Part Number: "+ii.getRequiredMachine());
						System.out.println("Required Quantity: "+ii.getRequiredQuantity());
						System.out.println("Total Amount: "+ii.getAmount());
					}
					else
						System.out.println("Required Hardware not found or That much Quantity not available. ");
					display();
					break;
			default: System.out.println("Invalid Input!!");
					 display();
					 break;
			
		}
		
	}

}
