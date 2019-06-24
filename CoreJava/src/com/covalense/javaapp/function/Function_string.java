package com.covalense.javaapp.function;

import java.util.function.Function;

public class Function_string {
	
	public static void main(String[] args) {
		
		Function<String,Integer>f=s->s.length();
		Integer x=f.apply("morning");
		System.out.println(x);
	}

}
