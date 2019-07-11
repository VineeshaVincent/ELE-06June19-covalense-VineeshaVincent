package com.covalense.assessment.temperature;

public class TemperatureTest {
	public static void main(String[] args) {

		TemperatureValidator sv = new TemperatureValidator();
		try {
			sv.validate(29);
		} catch (HeavyTemperatureException e) {
			e.printStackTrace();
		}

	}
}
