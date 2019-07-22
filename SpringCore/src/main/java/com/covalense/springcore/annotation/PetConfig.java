package com.covalense.springcore.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.covalense.springcore.beans.Donkey;
import com.covalense.springcore.beans.Mokey;
import com.covalense.springcore.interfaces.Animal;

@Configuration
public class PetConfig {
	
	@Bean(name="monkey")
	public Animal getMokey() {
		return new Mokey();
	}
	@Bean (name="donkey")
	public Animal getDonkey() {
		return new Donkey();
	}
	@Bean(name="pet")
	public Pet getpet() {
		return new Pet();
	}

}
