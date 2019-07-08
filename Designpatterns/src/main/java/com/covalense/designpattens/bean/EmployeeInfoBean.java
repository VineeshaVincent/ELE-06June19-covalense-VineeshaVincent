
package com.covalense.designpattens.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_info")
public class EmployeeInfoBean {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="age")
	private int age;
	@Column(name="gender")
	private String gender;
	@Column(name="salary")
	private double salary;
	@Column(name="phone")
	private long phone;
	@Column(name="joining_date")
	private Date joining_date;
	@Column(name="account_number")
	private int account_number;
	@Column(name="email")
	private String email;
	@Column(name="designation")
	private String designation;
	@Column(name="dob")
	private Date dob;
	@Column(name="dept_id")
	private int dept_id;
	@Column(name="mngr_id")
	private int mngr_id;

}
