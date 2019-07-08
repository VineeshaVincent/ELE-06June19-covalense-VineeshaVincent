package com.covalense.designpattens;

import java.util.ArrayList;

import com.covalense.designpattens.bean.EmployeeInfoBean;
import com.covalense.designpatterns.dao.EmployeeDAO;
import com.covalense.designpatterns.dao.EmployeeDAOFactory;

import lombok.extern.java.Log;

@Log
public class DessinPatternsTest {
	public static void main(String[] args) {
		// EmployeeDAO dao=new EmployeeDAOJDBCImpl();
		// EmployeeDAO dao=new EmployeeDAOHibernatImpl();
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();

		printInfo(dao.getEmployeeInfo(1));
		printInfo(dao.getEmployeeInfo("2"));

		
		  ArrayList<EmployeeInfoBean>beans= dao.getAllEmployeeInfo();
		  for(EmployeeInfoBean bean:beans) { printInfo(bean);
		  }

	}// End of main

	private static void printInfo(EmployeeInfoBean bean) {
		log.info("id is=" + bean.getId());
		log.info("name is=" + bean.getName());
		log.info("id Age=" + bean.getAge());
		log.info("gender is=" + bean.getGender());
		log.info("salary is=" + bean.getSalary());
		log.info("phone is=" + bean.getPhone());
		log.info("joining_date is=" + bean.getJoining_date());
		log.info("account numberis=" + bean.getAccount_number());
		log.info("designation is=" + bean.getDesignation());
		log.info("dob is=" + bean.getDob());
		log.info("department_id is=" + bean.getDept_id());
		log.info("manager_id is=" + bean.getMngr_id());
	}
}
