package com.covalense.empspringrest.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;



@SuppressWarnings("serial")
@Entity

@Table(name="employee_experience_info")
//@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeExperienceInfoBean implements Serializable{

	@EmbeddedId
	private EmployeeExperiencePKBean experiencePKBean;
	@Column(name="designation")
	private String designation;

	@Column(name="joining_date")
	private Date joining_date;

	@Column(name="leaving_Date")
	private Date leaving_Date;

	public EmployeeExperiencePKBean getExperiencePKBean() {
		return experiencePKBean;
	}

	public void setExperiencePKBean(EmployeeExperiencePKBean experiencePKBean) {
		this.experiencePKBean = experiencePKBean;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getJoining_date() {
		return joining_date;
	}

	public void setJoining_date(Date joining_date) {
		this.joining_date = joining_date;
	}

	public Date getLeaving_Date() {
		return leaving_Date;
	}

	public void setLeaving_Date(Date leaving_Date) {
		this.leaving_Date = leaving_Date;
	}
	
	
}
