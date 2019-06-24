package com.covalense.javaapp.predicate;

import java.util.function.Predicate;

public class Testa_predicate {
	
	public static void main(String[] args) {
		
		
		Predicate<Integer>p=a ->a%2==0;
		boolean x=p.test(15);
		System.out.println(x);
	}

}
