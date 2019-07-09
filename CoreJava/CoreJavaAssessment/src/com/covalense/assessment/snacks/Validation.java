package com.covalense.assessment.snacks;

public class Validation {

	
	public Chips getChips(Chips chips) {
		if(chips instanceof Lays) {
			return new Lays();
		}else if(chips instanceof Kurkure) {
			return new Kurkure();
		}else if(chips instanceof Bingo) {
			return new Bingo();
	}
		return chips;
}
}
