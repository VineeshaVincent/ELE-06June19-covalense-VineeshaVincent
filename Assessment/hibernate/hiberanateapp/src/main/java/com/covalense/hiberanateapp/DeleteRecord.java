package com.covalense.hiberanateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.CustomerBean;

public class DeleteRecord {
public static void main(String[] args) {
	

	Configuration configuration= new Configuration();
	configuration.configure();
	SessionFactory sessionFactory=configuration.buildSessionFactory();
	Session session=sessionFactory.openSession();
	
	CustomerBean bean=session.get(CustomerBean.class, 11);
	Transaction transaction= session.beginTransaction();
	session.delete(bean);
	transaction.commit();
	session.close();
}
}
