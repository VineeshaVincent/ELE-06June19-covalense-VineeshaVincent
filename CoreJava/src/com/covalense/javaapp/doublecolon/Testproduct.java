package com.covalense.javaapp.doublecolon;

public class Testproduct {

	
	public static void main(String[] args) {
		
		
		Myproduct m= Product :: new;
		Product p=m.getProduct("powder", 100);
				
				
		System.out.println("name is="+p.name);
		System.out.println("cost is="+p.cost);
	}
}
