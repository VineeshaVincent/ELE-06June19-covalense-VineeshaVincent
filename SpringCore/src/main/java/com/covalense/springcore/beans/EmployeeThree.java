package com.covalense.springcore.beans;

public class EmployeeThree {
	private String name;
	private int id;

	private Dept dept;
	
	public EmployeeThree(String name, int id, Dept dept) {
		super();
		this.name = name;
		this.id = id;
		this.dept = dept;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}

}
