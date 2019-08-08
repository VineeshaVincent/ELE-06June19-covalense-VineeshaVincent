package com.covalense.emp.beans.manytoone;

import java.io.Serializable;
import java.util.Date;

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
@Table(name="employee_experience_info")
public class EmployeeExperienceInfoBean implements Serializable{

	@EmbeddedId
	private EmployeeExperiencePKBean experiencePKBean;
	@Column(name="designation")
	private String designation;

	@Column(name="joining_date")
	private Date joining_date;

	@Column(name="leaving_Date")
	private Date leaving_Date;
}
