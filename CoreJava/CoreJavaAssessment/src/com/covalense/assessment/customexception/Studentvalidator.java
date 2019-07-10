package com.covalense.assessment.customexception;

import lombok.extern.java.Log;

@Log
public class Studentvalidator {

	public void validate(Student s) throws InvalidMarksException {
		if (s.getPercentage() <= 50) {
			throw new InvalidMarksException();
		} else {
			log.severe("Hi"+s.getName() + " your are eligible for exam");
		}
	}
}
