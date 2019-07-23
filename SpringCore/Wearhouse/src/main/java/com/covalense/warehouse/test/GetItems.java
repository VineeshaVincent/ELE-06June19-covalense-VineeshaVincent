package com.covalense.warehouse.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.warehouse.beans.ItemBean;
import com.covalense.warehouse.config.HibernateConfig;

import lombok.extern.java.Log;
@Log
public class GetItems {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(HibernateConfig.class);
		
		SessionFactory factory=context.getBean(SessionFactory.class);
		
		Session session=factory.openSession();
		
		ItemBean item=session.get(ItemBean.class, 349);
		log.info("Item Name:"+item.getName());
		log.info("Item Id:"+item.getItemId());
		log.info("Item Quantity:"+item.getQuantity());
		log.info("Item Description:"+item.getDescription());
		log.info("Item Cost:"+item.getCost());
		
		session.close();
	}
}
