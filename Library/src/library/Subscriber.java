package library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Subscriber 
{
	SubscriberInput si = new  SubscriberInput();
	SubscriberInput[] s = new SubscriberInput[si.getNoOfSubscriber()];
	
	private Scanner sc = new Scanner(System.in);
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public void noOfSubscriber()
	{
		System.out.println("Enter the number of Subscriber: ");
		si.setNoOfSubscriber(sc.nextInt());
	}
	
	public void subscriberDetails() throws IOException
	{
		for(int i=0; i<si.getNoOfSubscriber();i++)
		{
			s[i] = new SubscriberInput();
			System.out.println("Enter User Number: ");
			s[i].setNumber(sc.nextInt());
			System.out.println("Enter the name: ");
			s[i].setName(br.readLine());
			System.out.println("Enter address: ");
			s[i].setAddress(br.readLine());
			System.out.println("Enter the Number of things Brrorwed by this User: ");
			s[i].setRentalItem(sc.nextInt());
		}
	}
	
}
