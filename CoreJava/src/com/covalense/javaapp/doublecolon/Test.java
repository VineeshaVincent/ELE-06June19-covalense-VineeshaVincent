package com.covalense.javaapp.doublecolon;

public interface Test {

	
	public static void main(String[] args) {
		Demo d=new Demo();
		mymath m=d :: sum;
		
		m.add(20,30);
	}
}
