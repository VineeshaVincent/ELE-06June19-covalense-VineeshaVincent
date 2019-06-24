package com.covalense.javaapp.assignments5;
import java.util.ArrayList;

public class Employee1Test {
	
public static void main(String[] args) {
	
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		
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
		
		al.add(e);
		al.add(e1);
		al.add(e2);
		
		for(int i=0;i<al.size();i++)
		{
			
			Employee emp=al.get(i);
			System.out.println("name is "+emp.getName());
			System.out.println("id is "+emp.getId());
			System.out.println("salary is "+emp.getSalary());
		}
		
	}

	
		
	}


