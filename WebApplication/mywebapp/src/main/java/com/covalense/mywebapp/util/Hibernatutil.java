package com.covalense.mywebapp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.mywebapp.bean.EmployeeInfoBean;


public class Hibernatutil {
	private static SessionFactory sessionFactory;
		private static SessionFactory buildSessionFactory(){
			
			Configuration configuration= new Configuration();
			configuration.configure("hibernate.cfg.xml");
			configuration.addAnnotatedClass(EmployeeInfoBean.class);
			return configuration.buildSessionFactory();
		}
		public static SessionFactory getSessionFactory() {
			if(sessionFactory==null) {
				sessionFactory=buildSessionFactory();
			}
			return sessionFactory;
		}
		public static Session openSession() {
			return getSessionFactory().openSession();
		}
}
