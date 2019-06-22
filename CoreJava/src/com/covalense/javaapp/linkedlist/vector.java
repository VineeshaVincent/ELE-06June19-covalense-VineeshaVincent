package com.covalense.javaapp.linkedlist;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vector {
	
public static void main(String[] args) {
		
	Vector li=new Vector();
	
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
