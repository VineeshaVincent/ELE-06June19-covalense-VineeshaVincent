package com.covalense.javaapp.asessment1;


//Q:WAP to find the count of only passed female candidates of the class. (Using Lambda and Stream)
public class Student {
	//Declaring the variables of student class
	int tkno;
	String name;
	String gender;
	double mark;
	//constructor with parameters
	public Student(int tkno, String name, String gender, double mark) {
		this.tkno = tkno;
		this.name = name;
		this.gender = gender;
		this.mark = mark;
	}
	public int getTkno() {
		return tkno;
	}
	public void setTkno(int tkno) {
		this.tkno = tkno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	
	

}
