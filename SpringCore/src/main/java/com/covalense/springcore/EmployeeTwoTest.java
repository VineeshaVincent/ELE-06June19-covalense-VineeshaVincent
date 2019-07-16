package com.covalense.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.springcore.beans.EmployeeTwo;

import lombok.extern.java.Log;
@Log
public class EmployeeTwoTest {

	public static void main(String[] args) {
		
		
	
	ApplicationContext applicationContext= new ClassPathXmlApplicationContext("employeetwo.xml");
	EmployeeTwo emp=(EmployeeTwo) applicationContext.getBean("emp");
	log.info("Name is:"+emp.getName());
	log.info("Id is :"+emp.getId());
	log.info("Department id :"+emp.getDept().getDeptId());
	log.info("Department name :"+emp.getDept().getDeptName());
}
}