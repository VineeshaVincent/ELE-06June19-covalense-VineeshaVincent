package com.covalense.javaapp.assignment2;

public class TestDriver {

	public static void main(String[] args) {
		
		Audi a=new Audi();
		Benz b=new Benz();
		Driver d=new Driver();
		d.receive(a);
	}
}
