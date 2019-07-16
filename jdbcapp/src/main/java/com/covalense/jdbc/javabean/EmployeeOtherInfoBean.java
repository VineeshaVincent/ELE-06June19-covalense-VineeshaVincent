package com.covalense.jdbc.javabean;

import java.util.Date;

import lombok.Data;
@Data
public class EmployeeOtherInfoBean {

	private int id;
	private String pan_no;
	private boolean ismarried;	
	private String  blood_grp;
	private boolean	ischallenged;
	private long emergency_contact_number;
	private String  emergency_contact_person;
	private String  nationality	;
	private String religion;
	private String father_nm;
	private String mother_nm;
	private String  spouse_nm;
	private String 	 passport ;
	private long 	 adhar;	
}
