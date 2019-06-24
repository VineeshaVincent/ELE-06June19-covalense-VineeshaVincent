package com.covalense.javaapp.fstproject;

public class busticket {
	public static void main(String[] args) {
		int age=73;
		double price=100;
		double discount=15.3;
		if(age>=65)
		{
			 price=price-(price*discount)/100;
		}
		System.out.println("yor ticket price is="+price);
	}
}
