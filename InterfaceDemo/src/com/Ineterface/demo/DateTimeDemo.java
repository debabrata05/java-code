package com.Ineterface.demo;
import java.time.LocalDate;
import java.time.LocalTime;

class ShowDateTime
{
     public void showDate()
     {
    	 LocalDate today = LocalDate.now();
  		 System.out.println("Current Date="+today);
  		 
  		 int day = today.getDayOfMonth();
  		 int month = today.getMonthValue();
  		 int year = today.getYear();
  		 
  		System.out.println("Date is ="+ day +"/"+month+"/"+year);
    	 
     }

     public void showTime()
     {
    	 LocalTime time = LocalTime.now();
 		 System.out.println("Current Time="+time);
 		 
 		 int hr = time.getHour();
 		 int min = time.getMinute();
 		 int sec = time.getSecond();
 		 System.out.println("Time = "+ hr + "-" +min+"-"+sec);
     }
}

public class DateTimeDemo 
{
	public static void main(String[] args) 
	{
		ShowDateTime obj = new ShowDateTime();
		obj.showDate();
		obj.showTime();
	}
}