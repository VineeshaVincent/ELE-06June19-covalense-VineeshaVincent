package com.covalense.javaapp.methodoverloading;

public class tesT1 {

	public static void main(String[] args) {
		girl g = new girl();
		MI m = new MI();
		IPHONE i = new IPHONE();

		g.receive(i);

	}

}//end of class
