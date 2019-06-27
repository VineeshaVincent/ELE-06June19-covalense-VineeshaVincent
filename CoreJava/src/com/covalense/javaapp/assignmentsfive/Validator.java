package com.covalense.javaapp.assignmentsfive;

import lombok.extern.java.Log;

@Log
public class Validator {

		void validate(String p) {
			try {
				if (p.length() <= 4) {
					throw new InvalidNameException();
				} else {
					log.info("Hi " + p);
				}
			} catch (InvalidNameException e) {
				log.info(""+e);
			}
		}
	}

