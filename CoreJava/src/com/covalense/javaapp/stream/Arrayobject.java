package com.covalense.javaapp.stream;

import java.util.stream.Stream;

import lombok.extern.java.Log;
@Log
public class Arrayobject {
	
	public static void main(String[] args) {
		
		Integer []a= {5,6,8,2,3};
		Stream<Integer>s=Stream.of(a);
		s.forEach(i->log.info("value is "+i));		
		
	}

}
