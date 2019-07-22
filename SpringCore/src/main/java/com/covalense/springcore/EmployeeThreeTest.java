package com.covalense.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.springcore.beans.EmployeeThree;


import lombok.extern.java.Log;
@Log
public class EmployeeThreeTest {

	public static void main(String[] args) {
		
		
		
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("employeethree.xml");
		EmployeeThree emp1=(EmployeeThree) applicationContext.getBean("emp1");
		
		log.info("Name is:"+emp1.getName());
		log.info("Id is :"+emp1.getId());
		
		log.info("Department id :"+emp1.getDept().getDeptId());
		log.info("Department name :"+emp1.getDept().getDeptName());
	}
}
