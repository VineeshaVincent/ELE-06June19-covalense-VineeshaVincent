package com.covalense.javaapp.assignmentseven;

import lombok.Data;

@Data
public class EmployeeExperience {

	private String name;
	private double salary;
	private int experience;
	private String designation;
	public EmployeeExperience(String name, double salary, int experience, String designation) {

		this.name = name;
		this.salary = salary;
		this.experience = experience;
		this.designation = designation;
	
	
	}	
	
}
