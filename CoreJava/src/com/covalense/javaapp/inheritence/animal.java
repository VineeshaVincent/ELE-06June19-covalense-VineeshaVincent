package com.covalense.javaapp.inheritence;

 class animal {

	void eat()
	{
		System.out.println("the animal is eating");
	}
}
 class lion extends animal{
	void run()
	{
		System.out.println("the lion is running");
	}
	 
}
class cow extends animal{
	void drink()
	{
		System.out.println("the cow is drinking");
	}
public static void main(String[] args) {
		animal a=new animal();
		a.eat();
		
		lion l=new lion();
		l.run();
		
		cow c=new cow();
		c.drink();
		
	}
}
