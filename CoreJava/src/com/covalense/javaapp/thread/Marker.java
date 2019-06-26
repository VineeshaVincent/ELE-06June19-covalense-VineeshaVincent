package com.covalense.javaapp.thread;

import lombok.extern.java.Log;

@Log
public class Marker implements Runnable  {
	
	public void run()
	{
		
		log.info("im run in marker");
		for(int i=0;i<5;i++) {
		log.info(""+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
	}

}
}
