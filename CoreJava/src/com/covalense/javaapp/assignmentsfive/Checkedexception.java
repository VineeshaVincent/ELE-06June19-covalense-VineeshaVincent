package com.covalense.javaapp.assignmentsfive;
public class Checkedexception {

	public static void main(String[] args) {

		int age = 19;
	AgeValidator v=new AgeValidator();
		try {
			v.validate(age);
		} catch ( InvalidAgeException e) {
			e.printStackTrace();
		}
	

}
}
