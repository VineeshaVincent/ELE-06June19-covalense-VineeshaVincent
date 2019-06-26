package com.covalense.javaapp.thread;

import lombok.extern.java.Log;

@Log
public class TestThread {
	
	public static void main(String[] args) {
		
		
		log.info("main started");
		Pen t1=new Pen();
		t1.setName("vini");
		t1.start();
	
		
		Pen t2=new Pen();
		t2.setName("sayu");
		t2.start();
		
		Pen t3=new Pen();
		t3.setName("ramya");
		t3.setPriority(10);
		t3.start();
		
		
	log.info("main ended");
	}

}
