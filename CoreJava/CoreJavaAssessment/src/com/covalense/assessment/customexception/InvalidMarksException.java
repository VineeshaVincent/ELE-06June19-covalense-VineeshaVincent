package com.covalense.assessment.customexception;

public class InvalidMarksException extends Exception{
	String str = " You are not eligible to write exam ";

	public String toString() {
		return str;
	}

	public String getMessage() {
		return str;
	}
}
