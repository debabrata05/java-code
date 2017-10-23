package com.account.savingAccount;

public class AccountDetails 
{
	private int accountNo;
	private double presentBalance;
	private double interestRate;
	private double newBalance;
	private static double newRate;
	
	public static double getNewRate() {
		return newRate;
	}

	public static void setNewRate(double newRate) {
		AccountDetails.newRate = newRate;
	}

	public double getNewBalance() {
		return newBalance;
	}

	public void setNewBalance(double newBalance) {
		this.newBalance = newBalance;
	}

	public int getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	
	public double getPresentBalance() {
		return presentBalance;
	}
	
	public void setPresentBalance(double presentBalance) {
		this.presentBalance = presentBalance;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
	
}
