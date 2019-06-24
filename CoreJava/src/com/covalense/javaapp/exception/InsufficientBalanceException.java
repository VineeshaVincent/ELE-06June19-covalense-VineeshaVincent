package com.covalense.javaapp.exception;

public class InsufficientBalanceException  extends Exception
{

	private String message="sorry";

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return message;
	}
	
	
}

