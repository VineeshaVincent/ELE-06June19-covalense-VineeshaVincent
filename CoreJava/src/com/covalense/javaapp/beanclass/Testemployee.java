package com.covalense.javaapp.beanclass;

public class Testemployee {
	public static void main(String[] args) {
		 
		employee e=new employee();
		e.setId(1);
		e.setName("vini");
		e.setGender('f');
		
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getGender());
		
	}

}
