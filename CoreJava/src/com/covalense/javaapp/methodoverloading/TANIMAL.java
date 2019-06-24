package com.covalense.javaapp.methodoverloading;

public class TANIMAL {
	void eat()
	{
		System.out.println("animal eats");
	}
	class cow extends TANIMAL
	{
		void eat()
		{
			System.out.println("cow eating");
		}
	}
	class lion extends TANIMAL
	{
		void eat()
		{
			System.out.println("lion eating");
		}
	}

}
