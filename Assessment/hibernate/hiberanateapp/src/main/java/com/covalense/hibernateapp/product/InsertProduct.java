package com.covalense.hibernateapp.product;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.ProductBean;

public class InsertProduct {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		ProductBean bean = new ProductBean();
		bean.setProductId(3);
		bean.setProductname("");
		bean.setColor("black");
		bean.setPrice(5);
		bean.setWeight(1.6);
		Transaction transaction = session.beginTransaction();
		session.save(bean);
		transaction.commit();
		session.close();
	}
}
