package com.covalense.javaapp.doublecolon;

public class Testboy {
	
	public static void main(String[] args) {
		
		
		Myboy m=Boy:: new;
		Boy by= m.getBoy("vini",8.9,20);
		System.out.println("name is"+by.name);
		System.out.println("age is"+by.age);
		System.out.println("height is"+by.height);
		
		
	}

}
