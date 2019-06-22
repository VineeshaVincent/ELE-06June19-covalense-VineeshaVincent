package com.covalense.javaapp.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class Listiterator {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
@SuppressWarnings("rawtypes")
ArrayList al=new ArrayList();
		
		al.add(15);
		al.add(7.0);
		al.add('d');
		al.add("vini");
		al.add('v');
		al.add("sayu");
		al.add('d');
		
		ListIterator lit=al.listIterator(3);
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
