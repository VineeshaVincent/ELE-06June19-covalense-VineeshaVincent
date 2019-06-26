package com.covalense.javaapp.enumm;

import lombok.extern.java.Log;

@Log
public class TestLoan {
	
	
	public static void main(String[] args) {
		
		Loan t=Loan.CAR;
		int constValue=t.getvalue();
		
		log.info("value of CAR loan is"+constValue);
		
		Loan t1=Loan.HOME;
		
		switch (t1) {
		
		case HOME:log.info("HOME");
		break;
		case PERSON:log.info("PERSON");
		break;
		case CAR:log.info("CAR");
		break;
		}
	}

}
