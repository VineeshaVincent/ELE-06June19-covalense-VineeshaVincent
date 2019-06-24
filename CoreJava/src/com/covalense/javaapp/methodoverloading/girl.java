package com.covalense.javaapp.methodoverloading;

public class girl {

	void receive(phone p) {
		if (p instanceof IPHONE) {
			System.out.println("i love u");
		} else if (p instanceof MI) {
			System.out.println("thank you brother");
		}
	}

}
