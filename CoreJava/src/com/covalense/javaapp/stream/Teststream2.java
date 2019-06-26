package com.covalense.javaapp.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
public class Teststream2 {

	
	public static void main(String[] args) {
		
ArrayList<Integer>al=new ArrayList<Integer>();
		
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		
		long t=al.stream().filter(i ->i%2!=0).count();
		System.out.println("objects are:"+t);
		
		List<Integer> x= al.stream().filter(i ->i%2!=0).collect(Collectors.toList());
		log.info(""+x);
	}
}
