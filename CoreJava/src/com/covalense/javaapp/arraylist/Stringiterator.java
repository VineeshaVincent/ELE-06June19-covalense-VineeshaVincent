package com.covalense.javaapp.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class Stringiterator {
	
	public static void main(String[] args) {
		
ArrayList <String>al=new ArrayList<String>();
		
		al.add("vini");
		al.add("sayu");
		
		ListIterator<String> lit=al.listIterator(3);
		System.out.println("*****************************->forward");
		while(lit.hasNext()) {
			String r=lit.next();
			System.out.println(r);
		}
		System.out.println("<-*********************backword");
		while(lit.hasPrevious()) {
			String r=lit.previous();
			System.out.println(r);
	}
	}

}
