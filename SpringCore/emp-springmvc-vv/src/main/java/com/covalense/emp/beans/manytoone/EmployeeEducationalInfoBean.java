package com.covalense.emp.beans.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@SuppressWarnings("serial")
@Data
@Entity
@ToString
@Table(name="employee_educational_info")
public class EmployeeEducationalInfoBean implements Serializable{

	@EmbeddedId
	private EmployeeEducationalPKBean educationalPKBean;
	
	
	@Column(name="degree_type")
	private String degree_type;
	
	@Column(name="branch")
	private String branch;
	
	@Column(name="college_name")
	private String college_name;
	
	@Column(name="university")
	private String university;
	
	@Column(name="yop")
	private String yop;
	
	@Column(name="percentage")
	private double percentage;
	
	@Column(name="location")
	private String location;
}
