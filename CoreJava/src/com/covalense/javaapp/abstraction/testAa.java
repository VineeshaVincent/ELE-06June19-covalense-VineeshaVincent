package com.covalense.javaapp.abstraction;

public class testAa {

	public static void main (String[] args)
	{
		machine m=new machine();
		ICICI i=new ICICI();
		HDFC h=new HDFC();
		SBI S=new SBI();
		
		
		m.slot(S);
	}
}
