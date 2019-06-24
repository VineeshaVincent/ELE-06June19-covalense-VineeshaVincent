package com.covalense.javaapp.function;

import java.util.function.Function;

public class Function_squre {
	
	public static void main(String[] args) {
		
		Function<Integer,Integer> f=r->r*r;
		int x=f.apply(4);
		System.out.println(x);
	}

}
