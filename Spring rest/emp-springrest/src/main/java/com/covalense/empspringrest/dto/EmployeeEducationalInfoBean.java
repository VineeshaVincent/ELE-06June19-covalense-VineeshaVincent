package com.covalense.empspringrest.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;



@SuppressWarnings("serial")
@Entity

@Table(name="employee_educational_info")
//@XmlAccessorType(XmlAccessType.FIELD)
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
	private Double percentage;
	
	@Column(name="location")
	private String location;

	public EmployeeEducationalPKBean getEducationalPKBean() {
		return educationalPKBean;
	}

	public void setEducationalPKBean(EmployeeEducationalPKBean educationalPKBean) {
		this.educationalPKBean = educationalPKBean;
	}

	public String getDegree_type() {
		return degree_type;
	}

	public void setDegree_type(String degree_type) {
		this.degree_type = degree_type;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCollege_name() {
		return college_name;
	}

	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getYop() {
		return yop;
	}

	public void setYop(String yop) {
		this.yop = yop;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
}
