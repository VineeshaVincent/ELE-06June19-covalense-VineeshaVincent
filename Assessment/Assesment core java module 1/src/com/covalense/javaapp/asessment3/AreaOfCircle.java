package com.covalense.javaapp.asessment3;

import java.util.logging.Logger;

//WAP to calculate average of three numbers, area of circle, NCR and write a unit test case.
public class AreaOfCircle {
	
	public static void main(String[] args) {
		Logger log=Logger.getLogger("AreaOfCircle");
		double radius = 7.6;
		double area;
		
		//formula for calculating area
		area=3.14*radius*radius;
		log.info("area of the circle is: "+area);
	}

}
