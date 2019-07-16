package com.covalense.hiberanateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.CustomerBean;

public class InserRecord {

	public static void main(String[] args) {
		
		Configuration configuration= new Configuration();
		configuration.configure();
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
				
				CustomerBean bean=new CustomerBean();
				bean.setId(14);
				bean.setFirstname("rama");
				bean.setLastname("df");
				bean.setAddress("jayanagar");
				bean.setContactNo(3463636);
				bean.setCity("bangalore");
				bean.setState("karnataka");
				bean.setCountry("india");
				
				Transaction transaction= session.beginTransaction();
				session.save(bean);
				transaction.commit();
				session.close();
	}
}
