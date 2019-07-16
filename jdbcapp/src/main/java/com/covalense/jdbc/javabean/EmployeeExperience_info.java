package com.covalense.jdbc.javabean;

import java.util.Date;

import lombok.Data;
@Data
public class EmployeeExperience_info {

	private int id;
	private String company_name;
	private String designation;
	private Date joining_date;
	private Date leaving_Date;
	
}
