package com.covalense.javaapp.exception;

import javax.naming.InsufficientResourcesException;

public class bank {
	
	static int balance=10000;
	
	public void withdraw(int amount)throws InsufficientResourcesException{
		
		if(balance>amount) {
			System.out.println("ok");
		}else {
			throw new InsufficientResourcesException();
		}
	}

}
