package com.covalense.javaapp.thread;

public class Testpvr {
		
		public static void main(String[] args) {
			
			Pvr p=new Pvr();
			
			
			Browser t1= new Browser(p);
			t1.start();
		
		}
	}


