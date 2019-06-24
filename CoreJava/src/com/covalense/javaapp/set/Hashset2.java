package com.covalense.javaapp.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Hashset2 {
	public static void main(String[] args) {
		
	
HashSet h=new HashSet();
	
	h.add("vini");
	h.add("vipin");
	h.add("sayu");
	h.add("ramya");
	
	
	for(Object r:h) {
		System.out.println(r);
	}
	Iterator it=h.iterator();
	while(it.hasNext()) {
		Object r=it.next();
		System.out.println(r);
		
	}
	


}}
