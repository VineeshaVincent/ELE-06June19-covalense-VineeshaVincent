package com.covalense.designpattens.builder;

import java.util.Date;


import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class EmployeeInfoData3 {
	
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
