package com.covalense.javaapp.stream;

import lombok.extern.java.Log;

@Log
public class DemoTest {
	
	public static void main(String[] args) {
		
		Demo a=x->log.info("value is"+x);
		a.print(6);
		
		Pen p=new Pen();
		Demo a1=p::write;
		a1.print(10);
	}

}
