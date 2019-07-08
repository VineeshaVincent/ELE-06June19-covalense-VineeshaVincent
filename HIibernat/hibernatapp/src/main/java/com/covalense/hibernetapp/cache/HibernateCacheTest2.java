package com.covalense.hibernetapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest2 {
	public static void main(String[] args) {
		
		
		//1.Load the config file
		Configuration config=new Configuration();
		config.configure("com/covalense/hibernetapp/cache/hibernate.cache.cfg.xml");
		config.addAnnotatedClass(NewEmployeeInfoBean.class);
		
		//2.build the session factory
		SessionFactory sessionFactory=config.buildSessionFactory();
		
		//3.open session
		Session session=sessionFactory.openSession();
		
		
		//4.Interact with DB Via session
		
		NewEmployeeInfoBean bean1=session.get(NewEmployeeInfoBean.class, 2);
		log.info("First time"+bean1.toString());
		

		NewEmployeeInfoBean bean2=session.get(NewEmployeeInfoBean.class, 2);
		log.info("Second time"+bean2.toString());
		
		NewEmployeeInfoBean bean3=session.get(NewEmployeeInfoBean.class, 2);
		log.info("Third time"+bean3.toString());
		
		//5.close the session
		session.close();
		
	}//Endof main

}//End of class
