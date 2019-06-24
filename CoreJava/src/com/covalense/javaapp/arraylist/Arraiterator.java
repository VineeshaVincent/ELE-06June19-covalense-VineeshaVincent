package com.covalense.javaapp.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraiterator {
	
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
		
		
		
		@SuppressWarnings("rawtypes")
		Iterator it=al.iterator();
		while(it.hasNext()) {
			Object r=it.next();
			System.out.println(r);
		}
	}

}
