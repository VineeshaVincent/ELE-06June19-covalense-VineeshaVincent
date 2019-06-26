package com.covalense.javaapp.consumer;

import java.util.function.Consumer;

public class Teststudent {
	
	
	public static void main(String[] args) {
		
		Student s1=new Student(44,77,88,"LIYA");
		Consumer<Student> c=s ->{
			
			double avg=(s.m1+s.m2+s.m3)/3.0;
			System.out.println(s.name +"average is = "+avg);
		};
		
		c.accept(s1);
	}

}
