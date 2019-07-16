package com.covalense.hibernateapp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="Student_info")
public class Student_infoBean  implements Serializable{
		@Id
		@Column(name="rollno")
		int rollno;
		@Column(name="name")
		String name;
		@Column(name="age")
		int age;
		@Column(name="gender")
		String gender;
		@Column(name="mobileno")
		int mobileno;
		@Column(name="emailId")
		String emailId;
	}

