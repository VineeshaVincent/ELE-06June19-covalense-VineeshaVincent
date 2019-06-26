package com.covalense.javaapp.enumm;

public enum Loan {
	
	HOME(240),PERSON(241),CAR(242);
	
	private int value;
	private Loan(int value) {
		this.value=value;
	}
	int getvalue() {
		return value;
	}

}
