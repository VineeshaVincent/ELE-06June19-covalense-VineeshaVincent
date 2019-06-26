package com.covalense.javaapp.supplier;

import java.util.function.Supplier;

public class Testcar {

	
	public static void main(String[] args) {
		
		Supplier<Car> s = ()->new Car(12.4);
		
		Car c = s.get();
		
		System.out.println(c.fuel);
	}
}
