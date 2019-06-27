package com.covalense.javaapp.assignmenttwo;

public class Driver {

	
	void receive(Car1 c)
	{
		if(c instanceof Audi)
		{
			System.out.println("drive audi");
		}else if(c instanceof Benz) {
			System.out.println("drive benz");
		}
	}
}
