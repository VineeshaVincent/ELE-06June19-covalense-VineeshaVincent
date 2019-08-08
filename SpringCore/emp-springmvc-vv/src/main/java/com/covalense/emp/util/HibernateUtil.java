package com.covalense.emp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

import com.covalense.emp.dto.EmployeeInfoBean;

public class HibernateUtil {
	
	@Autowired
	private SessionFactory sessionFactory;
//	private static SessionFactory sessionFactory;
//
//	private static SessionFactory buildSessionFactory(){
//	  
//	  Configuration configuration= new Configuration();
//	  configuration.configure("hibernate.cfg.xml");
//	 configuration.addAnnotatedClass(EmployeeInfoBean.class); return
//	  configuration.buildSessionFactory(); } public static SessionFactory
//	  getSessionFactory() { if(sessionFactory==null) {
//	  sessionFactory=buildSessionFactory(); } return sessionFactory; }
//	 
//	public static Session openSession() {
//		return getSessionFactory().openSession();
//	}
	public Session openSession() {
		return sessionFactory.openSession();
	}
}
