package com.covalense.hibernetapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest {
	public static void main(String[] args) {

		log.info("1st time" + getEmployeeData(2).toString());
		log.info("2nd time" + getEmployeeData(2).toString());
		log.info("3rd time" + getEmployeeData(2).toString());

	}// Endof main

	private static NewEmployeeInfoBean getEmployeeData(int id) {

		NewEmployeeInfoBean bean;
		try (Session session = HibernateUtilCache.openSession();) {
			bean = session.get(NewEmployeeInfoBean.class, id);
		}
		
		return bean;
	}// End of getEmployeeData

}// End of class
