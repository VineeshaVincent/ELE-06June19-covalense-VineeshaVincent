package com.covalense.javaapp.thread;

import lombok.extern.java.Log;

@Log
public class Pen extends Thread {
	
	public void run() {
		String s=getName();
		log.info(s);
		log.info("it is a run method");
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

	
}
