package com.covalense.javaapp.assignmentsfive;

public class InvalidAgeException extends Exception {
	String s = "enter valid age";

	@Override
	public String toString() {

		return s;
	}

	@Override
	public String getMessage() {

		return s;
	}
}
