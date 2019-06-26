package com.covalense.javaapp.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
public class Test {
	
	public static void main(String[] args) {
		
ArrayList<Integer>al=new ArrayList<Integer>();
		
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		
		
		List<Integer> x=al.stream().map(i ->i*2).collect(Collectors.toList());
		log.info(""+x);
	}

}
