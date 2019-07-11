package com.covalense.assessment.simpleintrest;

import lombok.extern.java.Log;

@Log
public class SimpleInterestTest {
	public static void main(String[] args) {
		SimpleInterest sp = (i, j, k) -> (i * j * k) / 100;
		double res = sp.getSimpleInterest(10, 10, 10);
		log.info("Simple Interest is: " + res);
	}
}
