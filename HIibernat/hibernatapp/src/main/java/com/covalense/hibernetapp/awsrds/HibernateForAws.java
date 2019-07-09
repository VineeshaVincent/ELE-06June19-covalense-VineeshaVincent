package com.covalense.hibernetapp.awsrds;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernetapp.cache.NewEmployeeInfoBean;

import lombok.extern.java.Log;
@Log
public class HibernateForAws {

	public static void main(String[] args) {
		
		//1.Load the config file
				Configuration config=new Configuration();
				config.configure("com/covalense/hibernetapp/awsrd/hibernateaws..cache.cfg.xml");
				config.addAnnotatedClass(NewEmployeeInfoBean.class);
				
				//2.build the session factory
				SessionFactory sessionFactory=config.buildSessionFactory();
				
				//3.open session
				Session session=sessionFactory.openSession();
				
				
				//4.Interact with DB Via session
				
				NewEmployeeInfoBean bean1=session.get(NewEmployeeInfoBean.class, 2);
				log.info("EmployeeDetails"+bean1.toString());
				session.close();
				
			
			
	}
}
