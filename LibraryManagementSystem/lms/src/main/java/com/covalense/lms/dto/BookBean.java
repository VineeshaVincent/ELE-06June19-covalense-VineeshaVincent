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
@Table(name="book")
public class BookBean implements Serializable{

	@Id
	@JsonProperty(value="bookId")
	@Column(name="bookId")
	private Integer bookId;
	
	@JsonProperty(value="bookName")
	@Column(name="bookName")
	private String bookName;
	
	@JsonProperty(value="author")
	@Column(name="author")
	private String author;
	
	@JsonProperty(value="category")
	@Column(name="category")
	private String category;
	
	@JsonProperty(value="availability")
	@Column(name="availability")
	private Boolean availability;
	
	@JsonProperty(value="publisher")
	@Column(name="publisher")
	private String publisher;
	
	@JsonProperty(value="noOfBooks")
	@Column(name="noOfBooks")
	private Integer noOfBooks;
	
	@JsonProperty(value="issuedNo")
	@Column(name="issuedNo")
	private Integer issuedNo;
	
	@JsonProperty(value="issuedDate")
	@Column(name="issuedDate")
	private Date issuedDate;
	
	@JsonProperty(value="shelfNo")
	@Column(name="shelfNo")
	private Integer shelfNo;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Boolean getAvailability() {
		return availability;
	}

	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Integer getNoOfBooks() {
		return noOfBooks;
	}

	public void setNoOfBooks(Integer noOfBooks) {
		this.noOfBooks = noOfBooks;
	}

	public Integer getIssuedNo() {
		return issuedNo;
	}

	public void setIssuedNo(Integer issuedNo) {
		this.issuedNo = issuedNo;
	}

	public Date getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}

	public Integer getShelfNo() {
		return shelfNo;
	}

	public void setShelfNo(Integer shelfNo) {
		this.shelfNo = shelfNo;
	}

	
}
