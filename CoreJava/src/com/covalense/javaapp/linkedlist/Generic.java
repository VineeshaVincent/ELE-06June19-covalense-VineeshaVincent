package com.covalense.javaapp.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Generic {
	
	public static void main(String[] args) {
		
		LinkedList<Double> al = new LinkedList <Double>();
		al.add(5.8);
		al.add(6.0);
		al.add(9.1);

		
		Iterator<Double>it=al.iterator();
		for(Double r:al) {
			System.out.println(r);

	}

}
}

