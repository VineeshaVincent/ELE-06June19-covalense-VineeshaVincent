package com.covalense.javaapp.myarrayclass;
import java.util.logging.Logger;

public class Testmyarray {
	
	private static final Logger log=Logger.getLogger("main method");
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		
	MyArrayClass mr=new MyArrayClass();
	int size=8;
	
	//adding values
	for(int i=0;i<size;i++) {
		mr.add("value"+i);
	}
	log.info("removing");
	mr.remove(30);

	//getting values
	for(int i=0;i<size;i++) {
		log.info("output:"+mr.get(i));
	}
	
	long endTIme=System.currentTimeMillis();
	log.info("Time:"+(endTIme-startTime)+"millisecs");
	log.info(""+size);

		
	}
	
	

}

