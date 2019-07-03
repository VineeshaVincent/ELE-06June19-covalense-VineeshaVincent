package com.covalense.javaapp.assignmentseven;

public class Student1 {

	private String name;
	private int id;
	private double percentage;
	private char gender;
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
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", id=" + id + ", percentage=" + percentage + ", gender=" + gender + "]";
	}
	public Student1(String name, int id, double percentage, char gender) {
		super();
		this.name = name;
		this.id = id;
		this.percentage = percentage;
		this.gender = gender;
	}
	
}
