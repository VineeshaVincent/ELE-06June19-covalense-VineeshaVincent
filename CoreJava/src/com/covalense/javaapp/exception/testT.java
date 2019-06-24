package com.covalense.javaapp.exception;

public class testT {
	
	public static void main(String[] args) {
		
		try {
			
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("do not divide by zero");
		}
		
		}
	}


