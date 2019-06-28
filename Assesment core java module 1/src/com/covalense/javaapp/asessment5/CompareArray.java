package com.covalense.javaapp.asessment5;

import static org.junit.Assert.assertArrayEquals;

import java.util.logging.Logger;

//Q:to compare two arrays


public class CompareArray {
	
	public static void main(String[] args) {
	Logger log=Logger.getLogger("CompareArray");
	int arr[]= {10,20,30,40};
	int arr1[]= {10,20,30,40};
	
	assertArrayEquals(arr, arr1);
	log.info("arrays are equal");
	}
}
