package com.covalense.javaapp.abstractionconcept;

public class TestAa {

	public static void main (String[] args)
	{
		Machine m=new Machine();
		Icici i=new Icici();
		HDFC h=new HDFC();
		Sbi S=new Sbi();
		
		
		m.slot(S);
	}
}
