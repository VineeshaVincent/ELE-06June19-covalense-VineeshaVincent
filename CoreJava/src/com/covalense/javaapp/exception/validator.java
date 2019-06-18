package com.covalense.javaapp.exception;

public class validator {
	
	String name;
	int lenght;
	void validate()
	{
		if(lenght<5){

			System.out.println("its correct");
		}else {
			throw new InvalidNameException("sorry it is not correct");
		}
		
	}
	

}
