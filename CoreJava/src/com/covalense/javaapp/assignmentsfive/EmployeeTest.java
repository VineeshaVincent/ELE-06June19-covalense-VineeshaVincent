package com.covalense.javaapp.assignmentsfive;

import java.util.TreeSet;

import com.covalense.javaapp.arraylist.Employee;

import lombok.extern.java.Log;
@Log
public class EmployeeTest {
	
	public static void main(String[] args) {
	
		
		Employeebyid idc = new Employeebyid();
		Employeebyname namec = new Employeebyname ();
		Employeebysalary salComp = new Employeebysalary ();

		TreeSet<Employee> t = new TreeSet<Employee>();

		int ch = 2;
		
		Employee e=new Employee();
		e.setName("pavi");
		e.setId(9);
		e.setSalary(678.00);
		
		Employee e1=new Employee();
		e1.setName("kalyani");
		e1.setId(7);
		e1.setSalary(1098.78);
		
		Employee e2=new Employee();
		e2.setName("manu");
		e2.setId(10);
		e2.setSalary(23980.78);
		
		t.add(e);
		t.add(e1);
		t.add(e2);

		switch (ch) {
		case 1:
			TreeSet<Employee> t1 = new TreeSet(idc);
			break;
		case 2:
			TreeSet<Employee> t2 = new TreeSet(namec);
			break;
		case 3:
			TreeSet<Employee> t3 = new TreeSet(salComp);
			break;

		}
		

		for (Employee p : t) {
			log.info("details are : " + p);

		}

	}

		
	}

	
		
	

		
	


