package com.covalense.javaapps.assignment5;

public class Employeebysalary {

	
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
