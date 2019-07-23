package com.covalense.warehouse.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.warehouse.beans.ItemBean;
import com.covalense.warehouse.config.HibernateConfig;

public class DeleteItem {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(HibernateConfig.class);
		
		SessionFactory factory=context.getBean(SessionFactory.class);
		
		Session session=factory.openSession();
		
		ItemBean item=session.get(ItemBean.class, 347);
		Transaction tran= session.beginTransaction();
		session.delete(item);
		tran.commit();
		session.close();
		
	}

}
