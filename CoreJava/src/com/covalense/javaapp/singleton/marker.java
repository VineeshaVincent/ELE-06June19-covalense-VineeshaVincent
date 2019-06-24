package com.covalense.javaapp.singleton;

public class marker {
	private static final marker m=new marker();
	
	private marker()
	{
		System.out.println("marker");
	}
	public static marker getmarker()
	{
		return m;
	}

}
