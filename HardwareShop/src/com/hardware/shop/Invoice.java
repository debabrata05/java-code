package com.hardware.shop;

import java.io.IOException;

public class Invoice 
{

	public static void main(String[] args) throws IOException 
	{
		InvoiceManagement im = new InvoiceManagement();
		im.invoiceInput();
		im.display();

	}

}
