package com.covalense.assessment.immuteclass;

import lombok.extern.java.Log;

@Log
public class PersonTest {
	public static void main(String[] args) {
		Person p=new Person("karan", 30);
		log.info("Name is: "+p.getName());
		log.info("Age is: "+p.getAge());

		Person p1=new Person("mitra", 20);
		log.info("Name is: "+p1.getName());
		log.info("Age is: "+p1.getAge());
			}
}
