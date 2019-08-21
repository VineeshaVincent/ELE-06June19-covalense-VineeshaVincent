package com.covalense.lms.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;



@SuppressWarnings("serial")
@Entity
@Table(name="book_status")
public class BookStatusBean implements Serializable{

	@Id
	@JsonProperty(value="bookId")
	@Column(name="bookId")
	private Integer bookId;
	
	@JsonProperty(value="userId")
	@Column(name="userId")
	private Integer userId;
	
	@JsonProperty(value="bookName")
	@Column(name="bookName")
	private String bookName;
	
	@JsonProperty(value="issuedDate")
	@Column(name="issuedDate")
	private Date issuedDate;
	
	@JsonProperty(value="expiredDate")
	@Column(name="expiredDate")
	private Date expiredDate;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Date getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}

	public Date getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}

	
}
