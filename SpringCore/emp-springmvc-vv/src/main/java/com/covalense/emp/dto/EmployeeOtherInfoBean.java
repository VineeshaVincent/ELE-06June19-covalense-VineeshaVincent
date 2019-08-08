package com.covalense.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="employee_other_info")

public class EmployeeOtherInfoBean implements Serializable{
	@Id
	@Column(name="id")
	private int id;
	@Column(name="pan_no")
	private String pan_no;
	@Column(name="ismarried")
	private boolean ismarried;
	@Column(name="blood_grp")
	private String  blood_grp;
	@Column(name="ischallenged")
	private boolean	ischallenged;
	@Column(name="emergency_contact_number")
	private long emergency_contact_number;
	@Column(name="emergency_contact_person")
	private String  emergency_contact_person;
	@Column(name="nationality")
	private String  nationality	;
	@Column(name="religion")
	private String religion;
	@Column(name="father_nm")
	private String father_nm;
	@Column(name="mother_nm")
	private String mother_nm;
	@Column(name="spouse_nm")
	private String  spouse_nm;
	@Column(name="passport")
	private String 	 passport ;
	@Column(name="adhar")
	private long 	 adhar;
	
	
}
