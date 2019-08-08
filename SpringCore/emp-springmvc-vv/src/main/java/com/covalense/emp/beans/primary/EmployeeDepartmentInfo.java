package com.covalense.emp.beans.primary;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@SuppressWarnings("serial")
@Data
@Entity
@Table(name="department_info")
public class EmployeeDepartmentInfo implements Serializable{
	@Id
	@Column(name="dept_id")
	private int dept_id;
	
	@Column(name="dept_name")
	private String dept_name ;
	
	
	
}
