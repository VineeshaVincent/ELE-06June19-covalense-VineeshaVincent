package com.covalense.javaapp.assignmentseven;

public class Student {

	private int id;
	private String name;
	private double percentage;
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
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}
	public Student() {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	
	
}
