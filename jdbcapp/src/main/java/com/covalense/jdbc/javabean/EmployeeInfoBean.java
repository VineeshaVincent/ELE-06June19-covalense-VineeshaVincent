package com.covalense.jdbc.javabean;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeInfoBean {

	private int id;
	private String name;
	private int age;
	private String gender;
	private double salary;
	private long phone;
	private Date joiningDate;
	private int account_number;
	private String email;
	private String designation;
	private Date dob;
	private int departmentId;
	private int managerId;

}
