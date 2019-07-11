package com.covalense.assessment.objectofpen;

import lombok.extern.java.Log;

@Log
public class Pen {
	Pen() {
		log.info("I am Zero parametrized constructor");
	}

	void write() {
		log.info("I am write method()");
	}
}
