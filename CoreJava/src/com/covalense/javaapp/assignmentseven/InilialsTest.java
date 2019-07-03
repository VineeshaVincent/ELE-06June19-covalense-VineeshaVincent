package com.covalense.javaapp.assignmentseven;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import lombok.extern.java.Log;
@Log
public class InilialsTest {
	
	public static void main(String[] args) {
		
		Student1 stu1=new Student1("navaneeth",1,98.6,'m');
		Student1 stu2=new Student1("kripa",2,87.0,'f');
		Student1 stu3=new Student1("shakil",3,67.9,'m');
		Student1 stu4=new Student1("pooja",4,39.7,'f');
		Student1 stu5=new Student1("manasi",5,78.0,'f');
		
	ArrayList<Student1>arrlist=new ArrayList<Student1>();
	arrlist.add(stu1);
	arrlist.add(stu2);
	arrlist.add(stu3);
	arrlist.add(stu4);
	arrlist.add(stu5);
	
	Function<Student1, Student1>f=i->{
		if(i.getGender()=='m') {
			return new Student1("Mr."+i.getName(),i.getId(),i.getPercentage(),i.getGender());
		}else if(i.getGender()=='f') {
			return new Student1("Miss."+i.getName(),i.getId(),i.getPercentage(),i.getGender());
		}
		return null;
	};
	List<Student1>list=arrlist.stream().map(f).collect(Collectors.toList());
	for(Student1 s:list) {
		
		log.info("details are:"+s);
	}
	}

}
