package com.covalense.javaapp.assignmentsfive;

import java.util.Comparator;

public class Employeebysalary implements Comparator<Employee> {

	
	public int compare(Employee e,Employee e1) {
		if(e.getSalary()>e1.getSalary()) {
			return 1;
		
		}else if(e.getSalary()<e1.getSalary()) {
			return -1;
		}else
		{
			return 0;
		}
	}
}
