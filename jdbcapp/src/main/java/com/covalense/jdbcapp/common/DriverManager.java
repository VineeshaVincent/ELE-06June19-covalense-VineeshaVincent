package com.covalense.jdbcapp.common;

public class DriverManager {

	private DriverManager() {}
	
	public static Connection getInstance(String str) {
		Connection ref=null;
		if(str.equals("one")) {
			ref=new ClassA();
		}else {
			ref=new ClassB();
		}
		return ref;
	}
}
