package com.covalense.hibernetapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.covalense.hibernetapp.dto.EmployeeInfoBean;
import com.covalense.hibernetapputil.Hibernatutil;

import lombok.extern.java.Log;
@Log
public class GetAllDetails {

	
	public static void main(String[] args) {
		
		SessionFactory factory=Hibernatutil.getSessionFactory();
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(EmployeeInfoBean.class);
		List<EmployeeInfoBean>emp=criteria.list();
		for (EmployeeInfoBean employeeInfoBean : emp) {
			log.info("id is"+employeeInfoBean.getId());
			log.info("name is"+employeeInfoBean.getName());
			log.info("age is"+employeeInfoBean.getAge());
			log.info("gender is"+employeeInfoBean.getGender());
			log.info("salary is"+employeeInfoBean.getSalary());
			log.info("phone is"+employeeInfoBean.getPhone());
			log.info("joining_date is"+employeeInfoBean.getJoining_date());
			log.info("account_no is"+employeeInfoBean.getAccount_number());
			log.info("email is"+employeeInfoBean.getEmail());
			log.info("designation is"+employeeInfoBean.getDesignation());
			log.info("dob is"+employeeInfoBean.getDob());
			log.info("dept_id is"+employeeInfoBean.getDept_id());
			log.info("mngr_id is"+employeeInfoBean.getMngr_id());
		}
	}
}
