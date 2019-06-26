package com.covalense.javaapp.supplier;

import java.util.function.Supplier;

public class Testgun {

	
	public static void main(String[] args) {
		
		
		Supplier<Gun>s=()-> new Gun(100);
		Gun g=s.get();
		System.out.println(g.bullets);
				
	}
}
