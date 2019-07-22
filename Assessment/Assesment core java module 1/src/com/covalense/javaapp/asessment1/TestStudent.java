package com.covalense.javaapp.asessment1;

import java.util.ArrayList;

public class TestStudent {
	
	public static void main(String[] args) {
		
		ArrayList<Student>s=new ArrayList<Student>();
		
		Student s1=new Student(1, "pooja", "female", 90);
		Student s2=new Student(2,"riya","female",50);
		Student s3=new Student(3, "pavi", "male", 89);
		Student s4=new Student(4,"kumar","male",49);
		Student s5=new Student(5, "meenu", "female", 85);
		Student s6=new Student(6,"sooraj","male",50);
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		s.add(s6);
		
	}

}
