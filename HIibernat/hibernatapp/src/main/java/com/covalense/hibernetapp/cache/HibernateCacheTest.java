package com.covalense.hibernetapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest {
	public static void main(String[] args) {
		
		
		log.info("1st time"+getEmployeeData(2).toString());
		log.info("2nd time"+getEmployeeData(2).toString());
		log.info("3rd time"+getEmployeeData(2).toString());
		
		
	}//Endof main

	private  static NewEmployeeInfoBean getEmployeeData(int id) {
		

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
		
		
		//5.close the session
		session.close();
		return bean1;
		
	}//End of getEmployeeData 
	
	
}//End of class
