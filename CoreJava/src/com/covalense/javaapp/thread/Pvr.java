package com.covalense.javaapp.thread;

import lombok.extern.java.Log;

@Log
public class Pvr  {
	synchronized void book() {
		for(int i=0;i<5;i++) {
			log.info(""+i);
			
		}
		try {
			//sleep(2000);
			wait();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
}

synchronized void leaveMe() {
	notifyAll();
}
}