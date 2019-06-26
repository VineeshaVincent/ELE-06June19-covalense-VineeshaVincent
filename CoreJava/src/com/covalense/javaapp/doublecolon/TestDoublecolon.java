package com.covalense.javaapp.doublecolon;

public class TestDoublecolon {

	
	static void open() {
		System.out.println("*********************************open*********************");
		System.out.println("----------logic to open dorr");
	}
	
	public static void main(String[] args) {
		
		Room r= TestDoublecolon :: open;
		r.remove();
	}
}
