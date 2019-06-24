package com.covalense.javaapp.exception;

public class IRCTC {
	
	
	void train()
	{
		System.out.println("train is started");
try {
			
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("do not divide by zero");
		}
		
		
		System.out.println("train is ended");
		}
	}
	


