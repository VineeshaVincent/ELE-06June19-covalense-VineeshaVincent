package com.covalense.javaapp.student;

public class student {
	
	String name;
	int age;
	double percentage;
	
	student(String name,int age,double percentage)
	{
		this.name=name;
		this.age=age;
		this.percentage=percentage;
	}
	
	void display()
	{
		System.out.println("name is="+name);
		System.out.println("age is="+age);
		System.out.println("percentage is="+percentage);
	}

}
