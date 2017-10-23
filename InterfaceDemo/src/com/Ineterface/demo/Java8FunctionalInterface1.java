package com.Ineterface.demo;
/* An interface with exactly one abstract method becomes Functional 
  * Interface. It is not mandatory to use it, but it’s best practice to use it 
  * with functional interfaces to avoid addition of extra methods accidentally.
  * We try to have more than one abstract method, it throws compiler error.
  */


//define a functional interface
//@FunctionalInterface
interface FI 
{
    public void display();
    
    public void othermethod();
}

public class Java8FunctionalInterface1 
{
	public static void main(String[] args) 
	{
		//Old way using anonymous inner class
	    FI fit = new FI()
	                   {
	                        public void display()
	                        {
	                            System.out.println("Display Using old way");
	                        }
	                                     
	                        public void othermethod()
	                        {
	                        	System.out.println("hi");
	                        }
	                                     
	                    };
	     fit.display();//outputs: Display from old way
		
		
	    //Java 8 way Using lambda expression; '->' lambda expression
	    /*FunctionalInterfaceTest newWay = () -> 
	                                     {
	    	                                System.out.println("Display Using new Lambda Expression");
	    	                             };
	    newWay.display();//outputs : Display from new Lambda Expression*/
    }
}