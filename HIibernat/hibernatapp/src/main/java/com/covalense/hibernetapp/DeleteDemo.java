package com.covalense.hibernetapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernetapp.dto.EmployeeInfoBean;
import com.covalense.hibernetapputil.Hibernatutil;

public class DeleteDemo {

	
	public static void main(String[] args) {
		
		/*Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml ");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		EmployeeInfoBean empthe=session.get(EmployeeInfoBean.class,104);
		
		Transaction transaction= session.beginTransaction();
		session.delete(empthe);
		transaction.commit();
		session.close();*/
		
		
		SessionFactory factory = Hibernatutil.getSessionFactory();
		Session session = factory.openSession();
		
		EmployeeInfoBean empthe=session.get(EmployeeInfoBean.class,104);
		Transaction tran= session.beginTransaction();
		session.delete(empthe);
		tran.commit();
		session.close();
		
		
	}
}
