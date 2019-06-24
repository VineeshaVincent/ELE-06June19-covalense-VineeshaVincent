package com.covalense.javaapp.function;

import java.util.function.Function;

public class Function_radius {
	
	public static void main(String[] args) {
		
		
		Function<Double,Double>f= r-> 3.14*r*r;
		Double r=f.apply(52.0);
		System.out.println(r);
	}

}
