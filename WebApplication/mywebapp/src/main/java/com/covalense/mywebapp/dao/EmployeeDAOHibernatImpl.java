package com.covalense.mywebapp.dao;

import java.util.ArrayList;
import java.util.Arrays;

import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.covalense.mywebapp.bean.EmployeeInfoBean;
import com.covalense.mywebapp.util.Hibernatutil;

import lombok.extern.java.Log;
@Log
public class EmployeeDAOHibernatImpl implements EmployeeDAO{

	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		Session session=Hibernatutil.openSession();
		String hql=" from EmployeeInfoBean";
		Query query=session.createQuery(hql);
		ArrayList<EmployeeInfoBean> employeeinfoBeans=(ArrayList<EmployeeInfoBean>) query.list();
		return employeeinfoBeans;
	}
	public  EmployeeInfoBean getEmployeeInfo(String id) {
		return getEmployeeInfo(Integer.parseInt(id));
	}
	public  EmployeeInfoBean getEmployeeInfo(int  id) {
		EmployeeInfoBean bean=null;
		try(Session session=Hibernatutil.openSession();){
			bean=session.get(EmployeeInfoBean.class, id);
		}
		return bean;
	}
	private boolean saveorUpdate(EmployeeInfoBean bean) throws IllegalStateException, SystemException {
		Transaction txn=null;
		try(Session session=Hibernatutil.openSession();){
			txn=(Transaction) session.beginTransaction();
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
}
