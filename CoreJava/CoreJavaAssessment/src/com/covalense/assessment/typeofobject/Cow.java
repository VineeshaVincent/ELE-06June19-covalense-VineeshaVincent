package com.covalense.assessment.typeofobject;

import lombok.extern.java.Log;

@Log
public class Cow extends Animal{
	public void eat() {
		log.info("Cow eats ");
	}

}
