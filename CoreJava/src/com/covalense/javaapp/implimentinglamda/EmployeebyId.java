package com.covalense.javaapp.implimentinglamda;

import java.util.Comparator;

import com.covalense.javaapp.arraylist.Employee;

public class EmployeebyId {
	public class Employeebyid implements Comparator<Employee>{
		
		public int compare(Employee e,Employee e1) {
			if(e.getId()>e1.getId()) {
				return 1;
			
			}else if(e.getId()<e1.getId()) {
				return -1;
			}else
			{
				return 0;
			}
		}
}
}
