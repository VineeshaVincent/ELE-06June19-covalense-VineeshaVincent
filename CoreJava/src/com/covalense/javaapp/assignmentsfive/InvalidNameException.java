package com.covalense.javaapp.assignmentsfive;

	
	public class InvalidNameException extends RuntimeException {
		private String message = "enter valid name";

		public String toString() {
			return message;

		}

		public String getMessage() {
			return message;
		}

	}



