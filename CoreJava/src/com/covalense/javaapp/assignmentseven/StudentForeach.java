package com.covalense.javaapp.assignmentseven;

import java.util.ArrayList;

public class StudentForeach {
	
	public static void main(String[] args) {
		
		
		ArrayList<Student>stud=new ArrayList<Student>();
		Student student1=new Student();
		student1.setId(1);
		student1.setName("kanjana");
		student1.setPercentage(67.7);
		
		Student student2=new Student();
		student2.setId(2);
		student2.setName("sayooj");
		student2.setPercentage(99.8);
		
		Student student3=new Student();
		student3.setId(3);
		student3.setName("lakshmi");
		student3.setPercentage(80.5);
		
		Student student4=new Student();
		student4.setId(6);
		student4.setName("vipin");
		student4.setPercentage(19.6);
		
		stud.add(student1);
		stud.add(student2);
		stud.add(student3);
		stud.add(student4);
		stud.stream().forEach(i ->System.out.println(i));
	}

}
