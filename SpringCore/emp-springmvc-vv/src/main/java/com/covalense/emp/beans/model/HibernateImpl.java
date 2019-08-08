package com.covalense.emp.beans.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.emp.beans.manytomany.TrainingInfoBean;
import com.covalense.emp.beans.manytoone.EmployeeAddressInfoBean;
import com.covalense.emp.beans.manytoone.EmployeeEducationalInfoBean;
import com.covalense.emp.beans.manytoone.EmployeeExperienceInfoBean;
import com.covalense.emp.beans.onetoone.EmployeeOtherInfoBean;
import com.covalense.emp.beans.primary.EmployeeInfoBean;

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
	public void createTraining(TrainingInfoBean trainingInfoBean) {
		Session session=factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(trainingInfoBean);
		transaction.commit();
		session.close();
	}
	
}
