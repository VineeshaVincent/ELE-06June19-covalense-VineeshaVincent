package com.covalense.assessment.malefemaletopper;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
public class TestStudent {
	static Comparator<Student> c = (i, j) -> {
		if (i.getPercentage() > j.getPercentage()) {
			return 1;
		} else if (i.getPercentage() < j.getPercentage()) {
			return -1;
		} else {
			return 0;
		}
	};

	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Ram", 92, 1, 'M'));
		studentList.add(new Student("Hari", 42, 2, 'M'));
		studentList.add(new Student("Suri", 72, 3, 'M'));
		studentList.add(new Student("Teena", 42, 4, 'F'));
		studentList.add(new Student("Geetha", 62, 5, 'F'));
		studentList.add(new Student("Seetha", 91, 6, 'F'));

		Student femaleTopper = studentList.stream().filter(i -> i.getGender() == 'F').collect(Collectors.toList()).stream().max(c).get();
		log.info("Female Topper is: " + femaleTopper);
		
		Student maleTopper = studentList.stream().filter(i -> i.getGender() == 'M').collect(Collectors.toList()).stream().max(c).get();
		log.info("male Topper is: " + maleTopper);

	}
}
