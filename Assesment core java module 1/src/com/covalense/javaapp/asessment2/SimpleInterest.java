package com.covalense.javaapp.asessment2;

import java.util.logging.Logger;

//WAP to calculate simple interest, percentage, factorial and write the unit test case.


public class SimpleInterest {
	public static void main(String[] args) {
		
	Logger log=Logger.getLogger("Percentage");
	double principle_amount = 1000000.00;
	double rate = 6.7;
	double time = 3.0;
	double result;
	
	result=principle_amount*rate*time/100;
	
	log.info("simple intrest is "+result);
	
	}
}
