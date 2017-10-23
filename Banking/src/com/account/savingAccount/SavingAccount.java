package com.account.savingAccount;

public class SavingAccount 
{

	public static void main(String[] args)
	{
		SavingAccountManagement saver1 = new SavingAccountManagement(123456,2000,4);
		SavingAccountManagement saver2 = new SavingAccountManagement(987654,3000,5);
		saver1.calculateMonthlyInterest();
		saver1.display();
		saver2.calculateMonthlyInterest();
		saver2.display();
	}
	
}
