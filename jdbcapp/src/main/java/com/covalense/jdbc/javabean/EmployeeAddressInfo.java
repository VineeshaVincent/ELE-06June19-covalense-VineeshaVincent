package com.covalense.jdbc.javabean;

import java.util.Date;

import lombok.Data;
@Data
public class EmployeeAddressInfo {
	private int id;
	private String address;
	private String address_1;
	private String address_2;
	private String landmark;
	private String city;
	private String state;
	private String country;
	private int pin_code;
	
}
