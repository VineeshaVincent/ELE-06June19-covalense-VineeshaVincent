package com.covalense.javaapp.enumm;
import lombok.extern.java.Log;

@Log
public class TestEnum {

	public static void main(String[] args) {
		log.info(""+Gender.MALE);
		log.info(""+Gender.FEMALE);
		
		
		//ordinal
		log.info(""+Gender.FEMALE.ordinal());
		
		
		
		
		Gender t=Gender.FEMALE;
		switch (t) {
		
		case MALE:log.info("yes it is male");
		break;
		case FEMALE:log.info("yes it is FEmale");
		break;
		case OTHER:log.info("yes it is cross gender");
		break;
		}
	}

}
