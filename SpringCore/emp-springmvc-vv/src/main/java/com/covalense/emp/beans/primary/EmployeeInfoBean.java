package com.covalense.emp.beans.primary;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.covalense.emp.beans.manytomany.TrainingInfoBean;
import com.covalense.emp.beans.manytoone.EmployeeAddressInfoBean;
import com.covalense.emp.beans.manytoone.EmployeeEducationalInfoBean;
import com.covalense.emp.beans.manytoone.EmployeeExperienceInfoBean;
import com.covalense.emp.beans.onetoone.EmployeeOtherInfoBean;

import lombok.Data;
import lombok.ToString;
@SuppressWarnings("serial")
@Data
@Entity

@Table(name="employee_info")
public class EmployeeInfoBean implements Serializable{
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "infobean")
	private EmployeeOtherInfoBean employeeOtherInfoBean ;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "addressPKBean.infobean")
	private List<EmployeeAddressInfoBean>  addressInfoBean;
		
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "educationalPKBean.infobean")
	private List<EmployeeEducationalInfoBean>  educationalInfoBean;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "experiencePKBean.infobean")
	private List<EmployeeExperienceInfoBean>  experienceInfoBean;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "infoBeans")
	private List<TrainingInfoBean> trainingInfoBean;

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private int age;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="salary")
	private double salary;
	
	@Column(name="phone")
	private long phone;
	
	@Column(name="joining_date")
	private Date joining_date;
	
	@Column(name="account_number")
	private int account_number;
	
	@Column(name="email")
	private String email;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="dob")
	private Date dob;
	
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="department_id" , referencedColumnName = "dept_id")
	private EmployeeDepartmentInfo departmentInfoBean;
	/*
	 * @Column(name="mngr_id") private int mngr_id;
	 */
	@ManyToOne
	@JoinColumn(name="mngr_id" , referencedColumnName = "id")
	private EmployeeInfoBean mngr_id;
	
	
	@Column(name="password")
	private String password;
	
	


}
