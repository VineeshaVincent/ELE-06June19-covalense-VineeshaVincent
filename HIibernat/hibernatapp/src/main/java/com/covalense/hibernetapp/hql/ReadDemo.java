package com.covalense.hibernetapp.hql;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.covalense.hibernetapp.dto.EmployeeInfoBean;
import com.covalense.hibernetapputil.Hibernatutil;

import lombok.extern.java.Log;
@Log
public class ReadDemo {
	
	public static void main(String[] args) {
		
		SessionFactory factory=Hibernatutil.getSessionFactory();
		Session session=factory.openSession();
		String hql="select name from EmployeeInfoBean";
		Query query=session.createQuery(hql);
		List<String>ename=query.list();
		for(String empName:ename) {
			log.info("name----"+empName);
		
		
		}
		/*String hql="from EmployeeInfoBean";
		Query query=session.createQuery(hql);
		List<EmployeeInfoBean> employeeinfoBeans=query.list();
		for(EmployeeInfoBean employeeinfoBean:employeeinfoBeans) {
			log.info("id is"+employeeinfoBean.getId());
			log.info("name is"+employeeinfoBean.getName());
			log.info("age is"+employeeinfoBean.getAge());
			log.info("gender is"+employeeinfoBean.getGender());
			log.info("salary is"+employeeinfoBean.getSalary());
			log.info("phone is"+employeeinfoBean.getPhone());
			log.info("joining_date is"+employeeinfoBean.getJoining_date());
			log.info("account_no is"+employeeinfoBean.getAccount_number());
			log.info("email is"+employeeinfoBean.getEmail());
			log.info("designation is"+employeeinfoBean.getDesignation());
			log.info("dob is"+employeeinfoBean.getDob());
			log.info("dept_id is"+employeeinfoBean.getDept_id());
			log.info("mngr_id is"+employeeinfoBean.getMngr_id());*/
			
		}
	}


