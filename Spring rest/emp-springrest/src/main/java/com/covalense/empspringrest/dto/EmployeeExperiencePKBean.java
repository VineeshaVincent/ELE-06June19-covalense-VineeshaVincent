package com.covalense.empspringrest.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import com.fasterxml.jackson.annotation.JsonIgnore;

@Embeddable
//@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeExperiencePKBean implements Serializable{
	
	@JsonIgnore
	//@XmlTransient
	@ManyToOne
	@JoinColumn(name="id")
	private  EmployeeInfoBean infobean;
	@Column(name="company_name")
	private String company_name;
	public EmployeeInfoBean getInfobean() {
		return infobean;
	}
	public void setInfobean(EmployeeInfoBean infobean) {
		this.infobean = infobean;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	
	

}
