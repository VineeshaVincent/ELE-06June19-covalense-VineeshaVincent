package com.covalense.emp.beans.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@SuppressWarnings("serial")
@Data
@Entity
@ToString
@Table(name="employee_address_info")

public class EmployeeAddressInfoBean implements Serializable{
	
	@EmbeddedId
	private EmployeeAddressPKBean addressPKBean;
	
	@Column(name="address1")
	private String address1;
	
	@Column(name="address2")
	private String address2;
	
	@Column(name="landmark")
	private String landmark;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="country")
	private String country;
	
	@Column(name="pincode")
	private int pincode;
	
}
