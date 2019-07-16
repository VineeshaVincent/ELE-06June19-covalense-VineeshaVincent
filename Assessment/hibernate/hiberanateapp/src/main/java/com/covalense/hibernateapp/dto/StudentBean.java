package com.covalense.hibernateapp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Student")
public class StudentBean implements Serializable{

	@Id
	@Column(name="rollno")
	int rollno;
	@Column(name="firstname")
	String firstname;
	@Column(name="lastname")
	String lastname;
	@Column(name="subject")
	String subject;
	@Column(name="totalmark")
	String totalmark;
	
}
