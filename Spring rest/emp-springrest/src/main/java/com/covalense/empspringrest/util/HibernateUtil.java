package com.covalense.empspringrest.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;



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
