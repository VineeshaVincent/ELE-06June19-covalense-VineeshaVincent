package com.covalense.javaapp.asessment2;

public class Factorial {
	
	static int fact=1;
	
	int fact(int num) {
		
		for( int i=0;i<num;i++) {
			fact =fact*num;
		}
		return fact;
	}
	

}
