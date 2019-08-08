package com.covalense.emp.beans.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.covalense.emp.beans.primary.EmployeeInfoBean;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString
@Embeddable
public class EmployeeEducationalPKBean implements Serializable{

	@ManyToOne
	@JoinColumn(name="id")
	private  EmployeeInfoBean infobean;
	@Column(name="education_type")
	private String education_type;

}
