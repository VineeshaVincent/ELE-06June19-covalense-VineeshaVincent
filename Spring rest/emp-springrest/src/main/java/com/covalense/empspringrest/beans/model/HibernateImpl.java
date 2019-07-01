package com.covalense.empspringrest.beans.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.empspringrest.dto.EmployeeAddressInfoBean;
import com.covalense.empspringrest.dto.EmployeeEducationalInfoBean;
import com.covalense.empspringrest.dto.EmployeeExperienceInfoBean;
import com.covalense.empspringrest.dto.EmployeeInfoBean;
import com.covalense.empspringrest.dto.EmployeeOtherInfoBean;
import com.covalense.empspringrest.dto.EmployeeTrainingInfoBean;

public class HibernateImpl {

	private Configuration config = new Configuration();
	private SessionFactory factory = config
			.configure()
			.buildSessionFactory();
	public void createEmployee(EmployeeInfoBean infoBean,
			EmployeeOtherInfoBean otherInfoBean, 
			List<EmployeeAddressInfoBean> addressInfoBeans,
			List<EmployeeEducationalInfoBean>educationalInfoBeans,
			List<EmployeeExperienceInfoBean> experienceInfoBeans) {
		Session session=factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(infoBean);
		session.save(otherInfoBean);
		//session.save(addressInfoBean);
		for(EmployeeAddressInfoBean employeeAddressInfoBean:addressInfoBeans) {
				session.save(employeeAddressInfoBean);
		}
		for(EmployeeEducationalInfoBean employeeEducationalInfoBean:educationalInfoBeans) {
			session.save(employeeEducationalInfoBean);
		}
		for(EmployeeExperienceInfoBean employeeExperienceInfoBean:experienceInfoBeans) {
			session.save(employeeExperienceInfoBean);
		}
		transaction.commit();
		session.close();
	}
	public void createEmployee(EmployeeInfoBean infoBean) {
		Session session=factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(infoBean);
		transaction.commit();
		session.close();
	}
	public EmployeeInfoBean getEmployeeInfoBean(int id) {
		Session session=factory.openSession();
		EmployeeInfoBean bean= session.get(EmployeeInfoBean.class, id);
		session.close();
		return bean;
		
	}
	public void createTraining(EmployeeTrainingInfoBean trainingInfoBean) {
		Session session=factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(trainingInfoBean);
		transaction.commit();
		session.close();
	}
	
}
