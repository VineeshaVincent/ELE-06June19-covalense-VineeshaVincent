package com.covalense.javaapp.abstraction;

public abstract class pen extends pencil {
	

	void draw() {
		System.out.println("draw");
		
	}
	 void write()
	{
		 System.out.println("write");
	}
	 abstract  void color();
	

}
