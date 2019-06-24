package com.covalense.javaapp.beanclass;

import java.util.Date;

public class emp2 {

	private int id;
	private String name;
	private String dept;
	private double salary;
	private int age;
	private Date joining;
	private String gender;
	
	
	public emp2(int id, String name, String dept, double salary, int age, Date joining, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.age = age;
		this.joining = joining;
		this.gender = gender;
	}
	public emp2() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getJoining() {
		return joining;
	}
	public void setJoining(Date joining) {
		this.joining = joining;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "emp2 [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ", age=" + age
				+ ", joining=" + joining + ", gender=" + gender + "]";
	}
	
}
