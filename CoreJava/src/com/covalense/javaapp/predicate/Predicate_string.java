package com.covalense.javaapp.predicate;

import java.util.function.Predicate;

public class Predicate_string {
	
	public static void main(String[] args) {
		
	Predicate<String> s=a->a.length()>=5;
	boolean x=s.test("name");
	System.out.println(x);
	}

}
