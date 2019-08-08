package com.covalense.emp.dao;

import java.util.ArrayList;
import java.util.Arrays;

import javax.transaction.SystemException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.covalense.emp.dto.EmployeeInfoBean;
import com.covalense.emp.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class EmployeeDAOHibernatImpl implements EmployeeDAO{

	@Autowired
	//private HibernateUtil hibernateUtil;
	private SessionFactory sessionFactory;
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		Session session=sessionFactory.openSession();
		String hql=" from EmployeeInfoBean";
		Query query=session.createQuery(hql);
		ArrayList<EmployeeInfoBean> employeeinfoBeans=(ArrayList<EmployeeInfoBean>) query.list();
		return employeeinfoBeans;
	}
	public  EmployeeInfoBean getEmployeeInfo(String id) {
		return getEmployeeInfo(Integer.parseInt(id));
	}
	public  EmployeeInfoBean getEmployeeInfo(int  id) {
		EmployeeInfoBean bean;
		try(Session session=sessionFactory.openSession();){
			bean=session.get(EmployeeInfoBean.class, id);
		}
		return bean;
	}
	private boolean saveorUpdate(EmployeeInfoBean bean) throws IllegalStateException, SystemException {
		Transaction txn=null;
		try(Session session=sessionFactory.openSession();){
			txn=session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		}catch(Exception e) {
			log.severe(Arrays.toString(e.getStackTrace()));
			if(txn!=null) {
				txn.rollback();
			}
			return false;
		}
	}
	@Override
	public boolean createemployee(EmployeeInfoBean emp) {
		try {
			return saveorUpdate(emp);
		} catch (IllegalStateException e) {

			e.printStackTrace();
			return false;
		} catch (SystemException e) {
			e.printStackTrace();
			
			return false;
		}
	}
}
