package com.covalense.javaapp.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Genericstring {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("abc");
		al.add("cvb");
		al.add("bty");

		
		Iterator<String>it=al.iterator();
		while(it.hasNext()) {
			ArrayList<String> r = al;
			System.out.println(r);
		}
	}

}
