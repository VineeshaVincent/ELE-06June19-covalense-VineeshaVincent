package com.covalense.javaapp.fstproject;

public class discount {
	public static void main(String[] args) {
		double price=500;
		double discount=15.4;
		int visitcount=1;
		if(visitcount==1)
		{
			 price=price-(price*discount)/100;
			
		}
		System.out.println("you need to pay"+price);
	}
}
