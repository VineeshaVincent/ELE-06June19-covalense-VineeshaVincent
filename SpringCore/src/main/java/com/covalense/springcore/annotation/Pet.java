package com.covalense.springcore.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.covalense.springcore.interfaces.Animal;

public class Pet {

	private String name;
	@Autowired
	@Qualifier("donkey")
	private Animal animal;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	public void dosomething() {
		animal.eat();
		animal.makeSound();
	}
}
