package com.covalense.hibernetapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernetapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class ReadRecord {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml ");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		EmployeeInfoBean empthe=session.get(EmployeeInfoBean.class,2);
		
		log.info(""+empthe.getAge());
		log.info(""+empthe.getGender());
		session.close();
	}
}
