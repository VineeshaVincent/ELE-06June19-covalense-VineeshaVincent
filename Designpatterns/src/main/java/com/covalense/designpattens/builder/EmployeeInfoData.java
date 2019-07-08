package com.covalense.designpattens.builder;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
public class EmployeeInfoData {
	
	private int id;
	private String name;
	private int age;
	private String gender;
	private double salary;
	private long phone;
	private Date joining_date;
	private int account_number;
	private String email;
	private String designation;
	private Date dob;
	private int dept_id;
	private int mngr_id;
	
	
}
