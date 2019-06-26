package com.covalense.javaapp.enumm;

import java.io.IOException;

public class TryException {
	
	public static void main(String[] args) {
		
		
		try {
			
			//code
		}catch (ArithmeticException | NullPointerException e) {
		
		System.out.println(e.getMessage());
		
		}catch(Exception n) {
		System.out.println("general block");
	}

}
}
