package com.hardware.shop;

public class InvoiceInput 
{
	private String partNo;
	private String partDescription;
	private int quantity;
	private double price;
	private int noOfMachine;
	private int requiredQuantity;
	private String requiredMachine;
	private double amount;
	
	

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getRequiredMachine() {
		return requiredMachine;
	}

	public void setRequiredMachine(String requiredMachine) {
		this.requiredMachine = requiredMachine;
	}

	public int getRequiredQuantity() {
		return requiredQuantity;
	}

	public void setRequiredQuantity(int requiredQuantity) {
		this.requiredQuantity = requiredQuantity;
	}

	public int getNoOfMachine() {
		return noOfMachine;
	}

	public void setNoOfMachine(int noOfMachine) {
		this.noOfMachine = noOfMachine;
	}

	public String getPartNo() {
		return partNo;
	}
	
	public void setPartNo(String partInfo) {
		this.partNo = partInfo;
	}
	
	public String getPartDescription() {
		return partDescription;
	}
	
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
}
