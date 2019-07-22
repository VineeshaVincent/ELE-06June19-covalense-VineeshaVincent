package com.covalense.javaapp.asessment5;


import java.util.Arrays;
import java.util.logging.Logger;

//Q:WAP to sort the array elements
public class ArraySort {

	public static void main(String[] args) {
		Logger log=Logger.getLogger("ArraySort");
		
		int[] a= {20,1,6,90,15};
		
		Arrays.parallelSort(a);
		log.info("the sorted array is");
		for(int i=0;i<=a.length;i++) {
		log.info(""+i);
		
	}
	
}
}
