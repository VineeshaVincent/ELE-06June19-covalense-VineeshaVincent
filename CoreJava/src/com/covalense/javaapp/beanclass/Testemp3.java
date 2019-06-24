package com.covalense.javaapp.beanclass;

import java.util.logging.Logger;

public class Testemp3 {
	private static final Logger log=Logger.getLogger("main method");
	public static void main(String[] args) {
		
		
		EMp3 e=new EMp3();
		e.setAge(19);
		e.setDept("manager");
		e.setGender("male");
		e.setName("vinu");
		log.info("without lombok"+e.toString());
		
		EMp3 e1=new EMp3();
		e1.setAge(20);
		e1.setDept("sales");
		e1.setGender("female");
		e1.setName("riya");
		log.info("with lombok"+e1.toString());
		
	}

}
