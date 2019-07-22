package com.covalense.javaapp.asessment3;

import java.util.logging.Logger;

//WAP to calculate average of three numbers, area of circle, NCR and write a unit test case.



public class Average {
	public static void main(String[] args) {
	Logger log=Logger.getLogger("Average");
	
	int num1=5;
	int num2=10;
	int num3=20;
	double result;
	
	//formula for calculating the area
	result=(num1+num2+num3)/3;
	log.info("average of three number is "+result);
	
	}
	
}

