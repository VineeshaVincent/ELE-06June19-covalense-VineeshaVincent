package com.covalense.hiberanateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.CustomerBean;

import lombok.extern.java.Log;
@Log
public class ReadRecord {
public static void main(String[] args) {
	

	Configuration configuration= new Configuration();
	configuration.configure();
	SessionFactory sessionFactory=configuration.buildSessionFactory();
	Session session=sessionFactory.openSession();
	
	CustomerBean bean=session.get(CustomerBean.class, 11);
	log.info(" Id is"+bean.getId());
	log.info("First Name Is"+bean.getFirstname());
	log.info(" Last Name Is"+bean.getLastname());
	log.info(" Address Is"+bean.getAddress());
	log.info(" City Is"+bean.getCity());
	log.info("Contact No is"+bean.getContactNo());
	log.info("Country Is"+bean.getCountry());
	log.info("State Is"+bean.getState());
	
	session.close();
}
}
