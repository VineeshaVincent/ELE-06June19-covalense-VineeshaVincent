package com.covalense.assessment.typeofobject;

import lombok.extern.java.Log;

@Log
public class Dog extends Animal{
	public void eat() {
		log.info("Dog eats ");
	}
}
