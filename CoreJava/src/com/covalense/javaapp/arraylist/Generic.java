package com.covalense.javaapp.arraylist;

import java.util.ArrayList;

public class Generic {
	
	public static void main(String[] args) {
		
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(5.8);
		al.add(6.0);
		al.add(9.1);

		
		for(Double r:al) {
			System.out.println(r);
		}
	}

}
