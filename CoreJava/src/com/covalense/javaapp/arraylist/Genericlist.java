package com.covalense.javaapp.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Genericlist {
	
	public static void main(String[] args) {
		
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(5.8);
		al.add(6.0);
		al.add(9.1);

		
		Iterator<Double>it=al.iterator();
		for(Double r:al) {
			System.out.println(r);

		}
	}

}
