package com.covalense.javaapp.doublecolon;

import lombok.extern.java.Log;

@Log
public class Demo {

	public void sum(int a,int b) {
		int c=a+b;
		log.info("result is"+c);
	}
	
}
