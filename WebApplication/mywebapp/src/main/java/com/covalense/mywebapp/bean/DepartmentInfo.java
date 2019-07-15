package com.covalense.mywebapp.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="department_info")
public class DepartmentInfo {
	@Id
	@Column(name="dept_id")
	private int dept_id;
	@Column(name="dept_name")
	private String dept_name;
}
