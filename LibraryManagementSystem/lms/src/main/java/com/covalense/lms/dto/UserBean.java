package com.covalense.lms.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@SuppressWarnings("serial")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "UserId")
@JsonRootName(value = "UserBean")
@Entity
@Table(name = "user")
public class UserBean implements Serializable {

	@JsonProperty(value = "UserId")
	@Id
	@Column(name = "userId")
	private Integer userId;

	@JsonProperty(value = "userName")
	@Column(name = "userName")
	private String userName;

	@JsonProperty(value = "gender")
	@Column(name = "gender")
	private String gender;

	@JsonProperty(value = "password")
	@Column(name = "password")
	private String password;

	@JsonProperty(value = "userType")
	@Column(name = "userType")
	private String userType;

	@JsonProperty(value = "emailId")
	@Column(name = "emailId")
	private String emailId;

	@JsonProperty(value = "phone")
	@Column(name = "phone")
	private Integer phone;

	@JsonProperty(value = "numOfBooks ")
	@Column(name = "numOfBooks ")
	private Integer numOfBooks;

	@JsonProperty(value = "expiredDate  ")
	@Column(name = "expiredDate  ")
	private Date expiredDate;

	@JsonProperty(value = "activeStatus ")
	@Column(name = "activeStatus ")
	private Boolean activeStatus;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public Integer getNumOfBooks() {
		return numOfBooks;
	}

	public void setNumOfBooks(Integer numOfBooks) {
		this.numOfBooks = numOfBooks;
	}

	public Date getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}

	public Boolean getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(Boolean activeStatus) {
		this.activeStatus = activeStatus;
	}

	

}
