package com.covalense.javaapp.linkedlist;

import java.util.Enumeration;
import java.util.Vector;

public class Enumerationv {
	
	public static void main(String[] args) {
		
		Vector<Integer> v= new Vector<Integer>();
		v.add(90);
		v.add(5);
		v.add(1);
		v.add(10);
		
		
		Enumeration<Integer>e=v.elements();
		while(e.hasMoreElements()) {
			Integer k=e.nextElement();
			System.out.println(k );
		}
	}

}
