package com.covalense.javaapp.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lamda {
	
	public static void main(String[] args) {
		
	
ArrayList<Integer>al=new ArrayList<Integer>();
	
	al.add(15);
	al.add(6);
	al.add(37);
	al.add(18);
	al.add(9);
	
	Comparator<Integer> c=(i,j) -> i .compareTo(j)*-1;
	List<Integer>s=al.stream().sorted().collect(Collectors.toList());
	System.out.println(c);
}
}
