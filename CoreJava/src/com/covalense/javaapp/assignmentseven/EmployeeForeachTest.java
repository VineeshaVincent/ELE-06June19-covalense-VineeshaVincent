package com.covalense.javaapp.assignmentseven;

import java.util.ArrayList;

public class EmployeeForeachTest {
public static void main(String[] args) {
	
	ArrayList<Employee>emp=new ArrayList<Employee>();
	Employee e=new Employee();
	e.setName("sree");
	e.setId(21);
	e.setSalary(10000.67);
	
	Employee e1=new Employee();
	e1.setName("keerthi");
	e1.setId(31);
	e1.setSalary(34200.5);
	
	Employee e2=new Employee();
	e2.setName("priya");
	e2.setId(41);
	e2.setSalary(90876.5);
	
	emp.add(e);
	emp.add(e1);
	emp.add(e2);
	emp.stream().forEach(i ->System.out.println(i));
}	
	
}
