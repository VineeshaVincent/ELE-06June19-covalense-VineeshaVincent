package com.covalense.springAssinments.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.springAssinments.interfaces.Laptop;

import lombok.extern.java.Log;
@Log
public class LaptopTest {

public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("laptopConfig.xml");
		Laptop lappy = (Laptop)context.getBean("hp");
		
		log.info("hellooo");
		
		lappy.showSpecification();
		
		
	}//End of main

}
