package com.covalense.hibernateapp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Student_Otherinfo")
public class Student_OtherInfoBean implements Serializable{
	@Id
	@Column(name="rollno")
	int rollno;
	@Column(name="fathername")
	String fathername;
	@Column(name="mothername")
	String mothername;
	@Column(name="religion")
	String religion;
	@Column(name="nationality")
	String nationality;
	
}
