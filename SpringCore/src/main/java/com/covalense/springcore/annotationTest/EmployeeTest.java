package com.covalense.springcore.annotationTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springcore.annotation.Dept;
import com.covalense.springcore.annotation.DeptConfig;
import com.covalense.springcore.annotation.EmployeeConfig;
import com.covalense.springcore.annotation.EmployeeThree;

import lombok.extern.java.Log;
@Log
public class EmployeeTest {

	public static void main(String[] args) {
		
		//ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class,DeptConfig.class);
		
		ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeThree employeethree=context.getBean(EmployeeThree.class);
		
		log.info("name: "+employeethree.getName());
		log.info("id: "+employeethree.getId());
		
		Dept dept=employeethree.getDept();
		
		log.info("Dept_id: "+dept.getDeptId());
		log.info("Dept_name: "+dept.getDeptName());
	}
}
