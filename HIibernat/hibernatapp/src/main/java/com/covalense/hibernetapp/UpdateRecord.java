package com.covalense.hibernetapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernetapp.dto.EmployeeInfoBean;

public class UpdateRecord {

	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml ");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		EmployeeInfoBean empthe=session.get(EmployeeInfoBean.class,103);
		
		empthe.setAge(40);
		Transaction transaction= session.beginTransaction();
		session.update(empthe);
		transaction.commit();
		session.close();
		
	}
}
