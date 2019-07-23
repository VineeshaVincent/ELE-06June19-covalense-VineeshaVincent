package com.covalense.warehouse.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.warehouse.beans.ItemBean;
import com.covalense.warehouse.config.HibernateConfig;

public class AddItem {
	public static void main(String[] args) {
		
		
		ApplicationContext context=new AnnotationConfigApplicationContext(HibernateConfig.class);
		
		SessionFactory factory=context.getBean(SessionFactory.class);
		Session session=factory.openSession();
		
		
		ItemBean itemBean=new ItemBean();
		itemBean.setItemId(351);
		itemBean.setName("mat");
		itemBean.setQuantity(230);
		itemBean.setDescription("ert");
		itemBean.setCost(6789);
		
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.saveOrUpdate(itemBean);
			tx.commit();
			
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			
		}
		
		
		session.close();
	}

}
