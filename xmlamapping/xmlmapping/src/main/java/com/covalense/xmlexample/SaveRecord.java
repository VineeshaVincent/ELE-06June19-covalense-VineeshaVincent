package com.covalense.xmlexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.xmlexample.dto.DepartmentInfoBean;

public class SaveRecord {

	public static void main(String[] args) {
		
		
		
		DepartmentInfoBean dbean=new DepartmentInfoBean ();
		dbean.setDept_id(50);
		dbean.setDept_name("development");
		
		Configuration cfg=new Configuration ();
		cfg.configure();
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction trans=session.beginTransaction();
		
		session.save(dbean);
		trans.commit();
		session.close();
	}
}
