package com.covalense.hiberanateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.CustomerBean;

public class SaveOrUpdate {
public static void main(String[] args) {
	

	Configuration configuration= new Configuration();
	configuration.configure();
	SessionFactory sessionFactory=configuration.buildSessionFactory();
	Session session=sessionFactory.openSession();
			

	CustomerBean bean=new CustomerBean();
	

	bean.setId(15);
	bean.setFirstname("jithu");
	bean.setLastname("k");
	bean.setAddress("wrwerwe");
	bean.setContactNo(2423423);
	bean.setCity("bangalore");
	bean.setState("karnataka");
	bean.setCountry("india");
	
	Transaction transaction= session.beginTransaction();
	session.saveOrUpdate(bean);
	transaction.commit();
	session.close();
}
}
