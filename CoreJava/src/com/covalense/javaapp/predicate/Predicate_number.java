package com.covalense.javaapp.predicate;

import java.util.function.Predicate;

public class Predicate_number {

public static void main(String[] args) {
		
		int[] b= {2,5,9,6,4,3};
		Predicate<Integer>p=a ->a>4;
		for(int i = 0;i<b.length;i++) {
			boolean x=p.test(b[i]);
			if(!x) {
				System.out.println(b[i]);
			}
		}
}
}
