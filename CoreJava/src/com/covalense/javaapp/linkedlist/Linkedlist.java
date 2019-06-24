package com.covalense.javaapp.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist {
	
	public static void main(String[] args) {
		
		LinkedList li=new LinkedList();
		
		li.add("vini");
		li.add("vipin");
		li.add("sayu");
		li.add("ramya");
		
		
		for(Object r:li) {
			System.out.println(r);
		}
		Iterator it=li.iterator();
		while(it.hasNext()) {
			Object r=it.next();
			System.out.println(r);
			
		}
		ListIterator lit=li.listIterator();
		while(it.hasNext()) {
			Object r=lit.next();
			System.out.println(r);
		
	}
		while(lit.hasPrevious()) {
			Object r=lit.next();
			System.out.println(r);	

}
	}
}
