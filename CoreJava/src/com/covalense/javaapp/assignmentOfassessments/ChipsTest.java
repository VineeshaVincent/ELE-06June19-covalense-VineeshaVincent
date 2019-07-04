package com.covalense.javaapp.assignmentOfassessments;

public class ChipsTest {

	public static void main(String[] args) {
		
Chips chips=new Lays();
Chips chips1=new Kurkure();
Chips chips2=new Lays();
Chips chips3=new Bingo();
Validation validation=new Validation();
Chips chips4=validation.getChips(chips1);
chips4.eat();
	
	}
}
