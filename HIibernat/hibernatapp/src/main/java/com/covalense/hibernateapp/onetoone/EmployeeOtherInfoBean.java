package com.covalense.hibernateapp.onetoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPan_no() {
		return pan_no;
	}
	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}
	public boolean isIsmarried() {
		return ismarried;
	}
	public void setIsmarried(boolean ismarried) {
		this.ismarried = ismarried;
	}
	public String getBlood_grp() {
		return blood_grp;
	}
	public void setBlood_grp(String blood_grp) {
		this.blood_grp = blood_grp;
	}
	public boolean isIschallenged() {
		return ischallenged;
	}
	public void setIschallenged(boolean ischallenged) {
		this.ischallenged = ischallenged;
	}
	public long getEmergency_contact_number() {
		return emergency_contact_number;
	}
	public void setEmergency_contact_number(long emergency_contact_number) {
		this.emergency_contact_number = emergency_contact_number;
	}
	public String getEmergency_contact_person() {
		return emergency_contact_person;
	}
	public void setEmergency_contact_person(String emergency_contact_person) {
		this.emergency_contact_person = emergency_contact_person;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getFather_nm() {
		return father_nm;
	}
	public void setFather_nm(String father_nm) {
		this.father_nm = father_nm;
	}
	public String getMother_nm() {
		return mother_nm;
	}
	public void setMother_nm(String mother_nm) {
		this.mother_nm = mother_nm;
	}
	public String getSpouse_nm() {
		return spouse_nm;
	}
	public void setSpouse_nm(String spouse_nm) {
		this.spouse_nm = spouse_nm;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	public long getAdhar() {
		return adhar;
	}
	public void setAdhar(long adhar) {
		this.adhar = adhar;
	}	
	
}
