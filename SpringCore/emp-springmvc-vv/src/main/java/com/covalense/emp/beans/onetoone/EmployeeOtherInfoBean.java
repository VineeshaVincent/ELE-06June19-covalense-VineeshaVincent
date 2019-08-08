package com.covalense.emp.beans.onetoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.covalense.emp.beans.primary.EmployeeInfoBean;

import lombok.Data;
import lombok.ToString;
@SuppressWarnings("serial")
@Data
@Entity
@Table(name="employee_other_info")

public class EmployeeOtherInfoBean implements Serializable{
	@Id
	@OneToOne
	@JoinColumn(name="id")
	//we can write join in another way
	//PrimaryKeyJoinColumn(name="id")
	private  EmployeeInfoBean infobean;
	
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
	private String 	 passport;
	
	@Column(name="adhar")
	private long  adhar;
	
	
}
