package com.covalense.javaapp.assignmentseven;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
public class StudentTest2 {
	public static void main(String[] args) {
		
		ArrayList<Student>stud=new ArrayList<Student>();
		Student student1=new Student();
		student1.setId(5);
		student1.setName("manogna");
		student1.setPercentage(50.5);
		
		Student student2=new Student();
		student2.setId(12);
		student2.setName("gaayatri");
		student2.setPercentage(21.4);
		
		Student student3=new Student();
		student3.setId(3);
		student3.setName("meera");
		student3.setPercentage(83.5);
		
		Student student4=new Student();
		student4.setId(6);
		student4.setName("rithul");
		student4.setPercentage(92.6);
		
		stud.add(student1);
		stud.add(student2);
		stud.add(student3);
		stud.add(student4);
		
		List<Student> x= stud.stream().filter(i ->i.getPercentage()>75).collect(Collectors.toList());
		log.info("Students are:"+x);
		
	}

}
