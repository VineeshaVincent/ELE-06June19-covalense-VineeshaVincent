package com.covalense.javaapp.set;

import java.util.HashSet;

public class Hashset {
	
	public static void main(String[] args) {
		
		HashSet<Integer> h=new HashSet<Integer>();
		h.add(5);
		h.add(6);
		h.add(9);

		
		for(Integer r:h) {
			System.out.println(r);
	}

}
}
