package com.covalense.springboot.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;


@SuppressWarnings("serial")
@Entity
@Table(name="department_info")
//@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeDepartmentInfoBean implements Serializable{
	@Id
	@Column(name="dept_id")
	private Integer dept_id;
	
	@Column(name="dept_name")
	private String dept_name ;

	public Integer getDept_id() {
		return dept_id;
	}

	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	
	
	
}
