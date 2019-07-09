package com.covalense.assessment.singleton;


public class Marker {
private static final Marker m=new Marker();
	
	private Marker()
	{
		System.out.println("marker");
	}
	public static Marker getmarker()
	{
		return m;
	}

}
