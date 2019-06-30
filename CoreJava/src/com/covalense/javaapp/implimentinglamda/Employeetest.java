package com.covalense.javaapp.implimentinglamda;


import java.util.Comparator;
import java.util.TreeSet;


public class Employeetest {

public static void main(String[] args) {
		
		
		
		Comparator<Employee> c= (e,f) ->{
		if(e.id>f.id) {
			return 1;
		}else if(e.id<f.id) {
			return -1;
		}else {
			return 0;
		}
		};
		
		//Comparator<Employee>c2 =(e,f) ->e.name.compareTo(f.name);
		
		TreeSet<Employee>s=new TreeSet<Employee>(c);
		Employee e=new Employee();
		e.setName("vini");
		e.setId(22);
		e.setSalary(34000.59);
		
		Employee e1=new Employee();
		e1.setName("sayu");
		e1.setId(3);
		e1.setSalary(5600.5);
		
		Employee e2=new Employee();
		e2.setName("ambili");
		e2.setId(4);
		e2.setSalary(7840.5);
		
		
		
		Employee e3=new Employee();
		e3.setName("reenu");
		e3.setId(5);
		e3.setSalary(12940.5);
		
		s.add(e);
		s.add(e1);
		s.add(e2);
		s.add(e3);
		for (Employee emp : s) {
			System.out.println("name is"+emp.getName());
			System.out.println("id is+"+emp.getId());
			System.out.println("salary is"+emp.getSalary());
		}
		
	}

}
