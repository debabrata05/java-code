package com.account.savingAccount;

import java.util.Scanner;

public class SavingAccountManagement 
{
	private AccountDetails ad = new AccountDetails();
	
	private static Scanner sc = new Scanner(System.in);
	
	
	public static double newInterest()
	{
		AccountDetails.setNewRate(sc.nextDouble());
		return AccountDetails.getNewRate();
	}
	
	public SavingAccountManagement(int no, double bal, double rate)
	{
		ad.setAccountNo(no);
		ad.setPresentBalance(bal);
		ad.setInterestRate(rate);
		
	}
	
	public void calculateMonthlyInterest()
	{
		ad.setNewBalance(((ad.getPresentBalance() * ad.getInterestRate())/12)+ad.getPresentBalance());
	}
	
	public void display()
	{
		System.out.println("Account Number: "+ad.getAccountNo());
		System.out.println("Balance: "+ad.getNewBalance());
	}
	
}
