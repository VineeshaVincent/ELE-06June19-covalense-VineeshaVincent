package com.covalense.javaapp.arraylist;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeTree {
	
	public static void main(String[] args) {
		
		Employeebyname n=new Employeebyname();
		Set<Employee>s=new TreeSet<Employee>(n);
		Employee e=new Employee();
		e.setName("vini");
		e.setId(2);
		e.setSalary(34000.59);
		
		Employee e1=new Employee();
		e1.setName("sayu");
		e1.setId(3);
		e1.setSalary(5600.5);
		
		Employee e2=new Employee();
		e2.setName("ambili");
		e2.setId(4);
		e2.setSalary(7840.5);
		
		s.add(e);
		s.add(e1);
		s.add(e2);
		
		for (Employee emp : s) {
			System.out.println("name is"+emp.getName());
			System.out.println("id is+"+emp.getId());
			System.out.println("salary is"+emp.getSalary());
		}
		
	}

}
