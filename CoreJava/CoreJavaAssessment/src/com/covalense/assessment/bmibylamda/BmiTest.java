package com.covalense.assessment.bmibylamda;

import lombok.extern.java.Log;

@Log
public class BmiTest {

	public static void main(String[] args) {
		Bmi bmi = (i, j) -> i / (j * j);

		double bmiValue = bmi.bmiValue(165, 47);
		if (bmiValue < 18.5) {
			log.info(bmiValue + " is Under Weight");
		} else if (bmiValue <= 24.9) {
			log.info(bmiValue + " is Normal");
		} else if (bmiValue <= 29.9) {
			log.info(bmiValue + " is Over Weight");
		} else {
			log.info(bmiValue + " is Obesity");
		}

	}
}
