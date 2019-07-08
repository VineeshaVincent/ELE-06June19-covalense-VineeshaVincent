package com.covalense.designpatterns.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.covalense.designpattens.bean.EmployeeInfoBean;

public class EmployeeDAOHibernatImpl implements EmployeeDAO {

	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(EmployeeInfoBean.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session=factory.openSession();
		String hql=" from EmployeeInfoBean";
		Query query=session.createQuery(hql);
		ArrayList<EmployeeInfoBean> employeeinfoBeans=(ArrayList<EmployeeInfoBean>) query.list();
		return employeeinfoBeans;
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {
		return getEmployeeInfo(Integer.parseInt(id));
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(EmployeeInfoBean.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		EmployeeInfoBean bean=session.get(EmployeeInfoBean.class, id);
		session.close();
		return bean;
	}
	
}
