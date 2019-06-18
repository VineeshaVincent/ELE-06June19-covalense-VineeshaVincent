package com.covalense.javaapp.assignment2;

public class Driver {

	
	void receive(car1 c)
	{
		if(c instanceof audi)
		{
			System.out.println("drive audi");
		}else if(c instanceof benz) {
			System.out.println("drive benz");
		}
	}
}
