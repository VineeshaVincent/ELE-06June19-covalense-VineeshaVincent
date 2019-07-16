package com.covalense.springcore;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.springcore.beans.EmployeeBean;

import lombok.extern.java.Log;
@Log
public class EmployeeBeanTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("beans.xml");
	
		EmployeeBean emp1=(EmployeeBean) applicationContext.getBean("employeeBean1");
		
		
		log.info("enter the name 1 ");
		emp1.setName(sc.nextLine());
		
		log.info("enter the id 1");
		emp1.setId(sc.nextInt());
		sc.nextLine();
		
		EmployeeBean emp2=(EmployeeBean) applicationContext.getBean("employeeBean2");
		
		log.info("enter the name 2 ");
		emp2.setName(sc.nextLine());
		
		log.info("enter the id 2");
		emp2.setId(sc.nextInt());
		sc.nextLine();
		
		log.info("Name is:"+emp1.getName());
		log.info("Id is :"+emp1.getId());
		
		log.info("Name is:"+emp2.getName());
		log.info("Id is :"+emp2.getId());
		
		((AbstractApplicationContext)applicationContext).close();
	
	
		/*
		 * log.info("Name is:"+employeeBean.getName());
		 * log.info("Id is :"+employeeBean.getId());
		 * 
		 * EmployeeBean employeeBean2=(EmployeeBean)applicationContext.getBean("employeeBean2");
		 * log.info("Name is:"+employeeBean2.getName());
		 * log.info("Id is :"+employeeBean2.getId());
		 */
		
	}
}
