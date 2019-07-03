package com.covalense.javaapp.assignmentseven;

import java.util.ArrayList;
import java.util.Comparator;

import lombok.extern.java.Log;
@Log
public class SortStudentByIdTest {

	public static void main(String[] args) {
		
		Student1 stu1=new Student1("navaneeth",10,98.6,'m');
		Student1 stu2=new Student1("kripa",25,87.0,'f');
		Student1 stu3=new Student1("shakil",3,67.9,'m');
		Student1 stu4=new Student1("pooja",40,39.7,'f');
		Student1 stu5=new Student1("manasi",5,78.0,'f');
		
		
		ArrayList<Student1>arrlist=new ArrayList<Student1>();
		arrlist.add(stu1);
		arrlist.add(stu2);
		arrlist.add(stu3);
		arrlist.add(stu4);
		arrlist.add(stu5);
		
		 Comparator<Student1> c=(a,b)->{
			
			if(a.getId()>b.getId()) {
				return 1;
			}else if(a.getId()<b.getId()) {
				return -1;
			}else {
				return 0;
			}
		};
		
		log.info("the students details sorted acording to id are:");
		arrlist.stream().sorted(c).forEach(i->log.info(""+i));
	}
}
