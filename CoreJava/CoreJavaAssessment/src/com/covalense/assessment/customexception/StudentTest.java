package com.covalense.assessment.customexception;

public class StudentTest {
	public static void main(String[] args) {

		Student s = new Student("hema", 39, 4);
		Studentvalidator sv = new Studentvalidator();
		try {
			sv.validate(s);
		} catch (InvalidMarksException e) {
			e.printStackTrace();
		}

	}
}
