package com.covalense.javaapp.doublecolon;

public class Testfact {

	
	public static void main(String[] args) {
		
		Mystudent m=new Mystudent();
		Fact f=m::Fact;
		int i=f.getFact(5);
		System.out.println("factorial is"+i);
	}
}
