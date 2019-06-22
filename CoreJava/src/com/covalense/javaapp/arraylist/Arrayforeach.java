package com.covalense.javaapp.arraylist;

import java.util.ArrayList;

public class Arrayforeach {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		ArrayList al=new ArrayList();
		
		al.add(15);
		al.add(8.6);
		al.add('d');
		al.add("vipin");
		al.add('v');
		al.add("rithu");
		al.add('d');
		al.add(null);
		
		for(Object r:al) {
			System.out.println(r);
		}
	}

}
