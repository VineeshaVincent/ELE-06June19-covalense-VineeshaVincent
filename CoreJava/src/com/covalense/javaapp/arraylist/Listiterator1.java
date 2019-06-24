package com.covalense.javaapp.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class Listiterator1 {

	
	public static void main(String[] args) {
		

		ArrayList<Double>al = new ArrayList<Double>();
		al.add(5.8);
		al.add(6.0);
		al.add(9.1);

		ListIterator<Double> lit=al.listIterator();
		System.out.println("*****************************->forward");
		while(lit.hasNext()) {
			Object r=lit.next();
			System.out.println(r);
		}
		System.out.println("<-*********************backword");
		while(lit.hasPrevious()) {
			Object r=lit.previous();
			System.out.println(r);
	}
	}
}
