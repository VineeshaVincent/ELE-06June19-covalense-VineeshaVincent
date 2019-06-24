package com.covalense.javaapp.exception;

public class InvalidNameException  extends RuntimeException{
	
	private String message;
	
	
	public  InvalidNameException(String message) {
		
		this.message=message;
		
	}

public String getMessage() {
		return message;
	}

@Override
public String toString() {
	
	return message;
}
	
	
}


