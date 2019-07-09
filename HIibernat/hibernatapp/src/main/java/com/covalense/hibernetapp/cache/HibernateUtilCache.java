package com.covalense.hibernetapp.cache;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtilCache {
	
	private static SessionFactory sessionFactory;
	
	private HibernateUtilCache() {}
	
	private static SessionFactory buildSessionFactory(){
		if(sessionFactory==null) {
			sessionFactory=new Configuration().configure("com/covalense/hibernetapp/cache/hibernate.cache.cfg.xml").addAnnotatedClass(NewEmployeeInfoBean.class).buildSessionFactory();

			}
		return sessionFactory;
	}
	

	public static Session openSession() {
		return buildSessionFactory().openSession();
	}

	

}
