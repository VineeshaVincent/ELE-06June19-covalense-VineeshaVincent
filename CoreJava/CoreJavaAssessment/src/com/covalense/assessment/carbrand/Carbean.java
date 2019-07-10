package com.covalense.assessment.carbrand;

import lombok.Data;

@Data
public class Carbean {
	private String car;
	private String brand;
	
	public Carbean(String car, String brand) {
		this.car = car;
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Carbean [car=" + car + ", brand=" + brand + "]";
	}
}
