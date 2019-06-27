package com.covalense.javaapp.assignmentsfive;


import lombok.extern.java.Log;
@Log
	public class AgeValidator {
		void validate(int a) throws  InvalidAgeException{
			if (a < 18) {
				throw new  InvalidAgeException();
			} else {
				log.info("you re eligible");
			}
		}
	}

