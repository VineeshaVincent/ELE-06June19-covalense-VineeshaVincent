package com.covalense.javaapp.linkedlist;

import java.util.ArrayList;
import java.util.Vector;

public class Vectorgeneric {

public static void main(String[] args) {
		
Vector<Double> al = new Vector<Double>();
		al.add(5.8);
		al.add(6.0);
		al.add(9.1);

		
		for(Double r:al) {
			System.out.println(r);
		}
	}
}
