package com.covalense.javaapp.assignments5;

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
