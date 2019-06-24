package com.covalense.javaapp.set;


import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Treeset2 {
	
	public static void main(String[] args) {
		
		
		TreeSet h=new TreeSet();
			
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
			
	}
}
