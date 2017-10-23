package com.Ineterface.demo;
/* An interface with exactly one abstract method & any number of default methods are becomes 
 * Functional Interface. It is not mandatory to use it, but it’s best practice to use it 
  * with functional interfaces to avoid addition of extra methods accidentally.
  * We try to have more than one abstract method, it throws compiler error.
  */


//define a functional interface
@FunctionalInterface
interface FunctionalInterfaceADD 
{
    void addition(int x, int y);
    
    default void method1()
    {
    	System.out.println("This is the first default Method");
    }
    
    default void method1(String s)
    {
    	System.out.println("Hello....." + s);
    }
    static void method3()
    {
    	System.out.println("Hi");
    }
}

public class FunctionalInterfaceDefault 
{
	public static void main(String[] args) 
	{
		FunctionalInterfaceADD newWay = (int x,int y) -> 
                                        {
                                        	int z = x + y;
                                            System.out.println("Sum is  " + z);
                                        };
        newWay.addition(5,10);
        
        newWay.method1();
        newWay.method1("CHANDAN");
        FunctionalInterfaceADD.method3();
  	}
}