package com.covalense.springcore.beans;

import com.covalense.springcore.interfaces.Animal;

import lombok.extern.java.Log;
@Log
public class Mokey implements Animal {

	@Override
	public void eat() {
		log.info(" monkey Eating banana");		

	}

	@Override
	public void makeSound() {
		log.info("Mokey is making sound!!!");
	}

}
