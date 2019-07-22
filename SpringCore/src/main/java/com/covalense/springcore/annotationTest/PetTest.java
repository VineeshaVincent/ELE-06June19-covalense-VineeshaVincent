package com.covalense.springcore.annotationTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.springcore.annotation.Pet;
import com.covalense.springcore.annotation.PetConfig;

public class PetTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("PetConfig.xml");
		
		Pet pet=ctx.getBean(Pet.class);
		pet.dosomething();
	}
}
