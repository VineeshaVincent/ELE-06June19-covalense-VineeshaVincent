package com.covalense.empspringrest.dto;


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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@SuppressWarnings("serial")
@JsonIdentityInfo(generator=
			ObjectIdGenerators.PropertyGenerator.class,property ="id")
//@XmlRootElement(name="EmployeeInfoBean")
@JsonRootName(value="EmployeeInfoBean")
//@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name="employee_info")
public class EmployeeInfoBean implements Serializable{
	
	//@XmlElement(name=" employeeOtherInfoBean ")
	@JsonProperty(value="employeeOtherInfoBean")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "infobean")
	private EmployeeOtherInfoBean employeeOtherInfoBean ;
	
	
	@JsonProperty(value="addressInfoBean")
	//@XmlElement(name=" addressInfoBean ")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "addressPKBean.infobean")
	private List<EmployeeAddressInfoBean>  addressInfoBean;
		
	
	@JsonProperty(value="educationalInfoBean")
	//@XmlElement(name=" educationalInfoBean ")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "educationalPKBean.infobean")
	private List<EmployeeEducationalInfoBean>  educationalInfoBean;
	
	
	@JsonProperty(value="experienceInfoBean")
	//@XmlElement(name=" experienceInfoBean ")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "experiencePKBean.infobean")
	private List<EmployeeExperienceInfoBean>  experienceInfoBean;
	
	@JsonProperty(value="trainingInfoBean")
	//@XmlElement(name=" trainingInfoBean ")
	@LazyCollection(LazyCollectionOption.FALSE)
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "infoBeans") 
	private List<EmployeeTrainingInfoBean> trainingInfoBean;
	 
	//@XmlElement(name="id")
	@JsonProperty(value="id")
	@Id
	@Column(name="id")
	private Integer id;
	
	//@XmlElement(name="name")
	@JsonProperty(value="name")
	@Column(name="name")
	private String name;
	
	//@XmlElement(name="age")
	@JsonProperty(value="age")
	@Column(name="age")
	private Integer age;
	
	//@XmlElement(name="gender")
	@JsonProperty(value="gender")
	@Column(name="gender")
	private String gender;
	
	//@XmlElement(name="salary")
	@JsonProperty(value="salary")
	@Column(name="salary")
	private Double salary;
	
	//@XmlElement(name="phone")
	@JsonProperty(value="phone")
	@Column(name="phone")
	private Long phone;
	
	//@XmlElement(name="joining_date")
	@JsonProperty(value="joining_date")
	@Column(name="joining_date")
	private Date joining_date;
	
	//@XmlElement(name="account_number")
	@JsonProperty(value="account_number")
	@Column(name="account_number")
	private Integer account_number;
	
	//@XmlElement(name="email")
	@JsonProperty(value="email")
	@Column(name="email")
	private String email;
	
	//(name="designation")
	@JsonProperty(value="designation")
	@Column(name="designation")
	private String designation;
	
	//@XmlElement(name="dob")
	@JsonProperty(value="dob")
	@Column(name="dob")
	private Date dob;

	//@XmlElement(name="departmentInfoBean")
	@JsonProperty(value="departmentInfoBean")
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="dept_id", referencedColumnName = "dept_id")
	private  EmployeeDepartmentInfoBean departmentInfoBean;
	 
	//@XmlTransient
	@JsonIgnore
	//@XmlElement(name="managerId")
	@JsonProperty(value="managerId")
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="mngr_id" , referencedColumnName = "id")
	private EmployeeInfoBean managerId;
	
	//@XmlElement(name="password")
	@JsonProperty(value="password")
	@Column(name="password")
	private String password;

 public EmployeeOtherInfoBean getEmployeeOtherInfoBean() {
		return employeeOtherInfoBean;
	}


	public void setEmployeeOtherInfoBean(EmployeeOtherInfoBean employeeOtherInfoBean) {
		this.employeeOtherInfoBean = employeeOtherInfoBean;
	}


	public List<EmployeeAddressInfoBean> getAddressInfoBean() {
		return addressInfoBean;
	}


	public void setAddressInfoBean(List<EmployeeAddressInfoBean> addressInfoBean) {
		this.addressInfoBean = addressInfoBean;
	}


	public List<EmployeeEducationalInfoBean> getEducationalInfoBean() {
		return educationalInfoBean;
	}


	public void setEducationalInfoBean(List<EmployeeEducationalInfoBean> educationalInfoBean) {
		this.educationalInfoBean = educationalInfoBean;
	}


	public List<EmployeeExperienceInfoBean> getExperienceInfoBean() {
		return experienceInfoBean;
	}


	public void setExperienceInfoBean(List<EmployeeExperienceInfoBean> experienceInfoBean) {
		this.experienceInfoBean = experienceInfoBean;
	}


	public List<EmployeeTrainingInfoBean> getTrainingInfoBean() {
		return trainingInfoBean;
	}


	public void setTrainingInfoBean(List<EmployeeTrainingInfoBean> trainingInfoBean) {
		this.trainingInfoBean = trainingInfoBean;
	}


	

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}


	public Long getPhone() {
		return phone;
	}


	public void setPhone(Long phone) {
		this.phone = phone;
	}


	public Date getJoining_date() {
		return joining_date;
	}


	public void setJoining_date(Date joining_date) {
		this.joining_date = joining_date;
	}


	public Integer getAccount_number() {
		return account_number;
	}


	public void setAccount_number(Integer account_number) {
		this.account_number = account_number;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public EmployeeDepartmentInfoBean getDepartmentInfoBean() {
		return departmentInfoBean;
	}


	public void setDepartmentInfoBean(EmployeeDepartmentInfoBean departmentInfoBean) {
		this.departmentInfoBean = departmentInfoBean;
	}


	


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public EmployeeInfoBean getManagerId() {
		return managerId;
	}


	public void setManagerId(EmployeeInfoBean managerId) {
		this.managerId = managerId;
	}
	
	


}
