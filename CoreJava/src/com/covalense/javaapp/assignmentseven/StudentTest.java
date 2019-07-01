package com.covalense.javaapp.assignmentseven;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.covalense.javaapp.arrays.Foreach1;

import lombok.extern.java.Log;


@Log
public class StudentTest {

	public static void main(String[] args) {
		
		ArrayList<Student>stud=new ArrayList<Student>();
		Student student1=new Student();
		student1.setId(55);
		student1.setName("kanjana");
		student1.setMark(67);
		
		Student student2=new Student();
		student2.setId(12);
		student2.setName("sayooj");
		student2.setMark(99);
		
		Student student3=new Student();
		student3.setId(30);
		student3.setName("lakshmi");
		student3.setMark(80);
		
		Student student4=new Student();
		student4.setId(6);
		student4.setName("vipin");
		student4.setMark(90);
		
		stud.add(student1);
		stud.add(student2);
		stud.add(student3);
		stud.add(student4);
	Comparator<Student> c=(i,j)->{
		if(i.getId()>j.getId()) {
			return 1;
		}else if(i.getId()<j.getId()) {
			return -1;
		}else {
			return 0;
		}
		
	};
	
	List<Student> list= stud.stream().sorted(c).collect(Collectors.toList());
	for (Student student : list) {
		log.info("details are:"+student);
	}
	}
}
