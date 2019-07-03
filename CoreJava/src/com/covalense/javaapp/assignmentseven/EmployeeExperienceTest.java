package com.covalense.javaapp.assignmentseven;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class EmployeeExperienceTest {

	public static void main(String[] args) {
		
		EmployeeExperience emp1=new EmployeeExperience("navaneeth",45600.99,3,"sotware engineer");
		EmployeeExperience emp2=new EmployeeExperience("liya",876590.99,1,"tester");
		EmployeeExperience emp3=new EmployeeExperience("surya",12000.00,0,"software engineer");
		EmployeeExperience emp4=new EmployeeExperience("kripa",5098077656.9,4,"manager");
		EmployeeExperience emp5=new EmployeeExperience("sayooj",4511600.99,1,"developer");
	ArrayList<EmployeeExperience>arrlist=new ArrayList<EmployeeExperience>();
	arrlist.add(emp1);
	arrlist.add(emp2);
	arrlist.add(emp3);
	arrlist.add(emp4);
	arrlist.add(emp5);
	List<EmployeeExperience>list =arrlist.stream().filter(i->i.getExperience()>2).collect(Collectors.toList());
	for(EmployeeExperience EmployeeExperience:list) {
		log.info("employee who has more than 2 years experience are:"+EmployeeExperience);
	}
	
	}

}
