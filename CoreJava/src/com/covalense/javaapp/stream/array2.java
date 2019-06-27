package com.covalense.javaapp.stream;

import java.util.stream.Stream;


public class array2 {
	
	public static void main(String[] args) {
		
		Stream<Integer>s=Stream.of(5,8,0,6,4);
		s.forEach(System.out::println);	
	}

}
