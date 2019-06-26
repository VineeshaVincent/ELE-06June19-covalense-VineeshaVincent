package com.covalense.javaapp.doublecolon;

public interface Test {

	
	public static void main(String[] args) {
		
		mymath m=Demo :: sum;
		
		m.add(20,30);
	}
}
