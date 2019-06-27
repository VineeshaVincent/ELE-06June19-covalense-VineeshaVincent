package com.covalense.javaapp.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(45);
		al.add(6);
		al.add(17);
		al.add(82);
		al.add(9);
		al.stream().forEach(i ->System.out.println(i));
		List<Integer>s=al.stream().sorted().collect(Collectors.toList());

		log.info("sorted array"+s);
		
		Comparator<Integer>c=(i,j)->i.compareTo(j);
		
		Integer minValue=al.stream().min(c).get();
		System.out.println(minValue);
		
		
		Comparator<Integer>c1=(i,j)->i.compareTo(j);
		
		Integer maxValue=al.stream().min(c1).get();
		System.out.println(maxValue);
	}
}
