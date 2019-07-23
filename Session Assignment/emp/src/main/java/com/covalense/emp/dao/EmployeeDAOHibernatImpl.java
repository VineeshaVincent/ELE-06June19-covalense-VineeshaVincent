package com.covalense.emp.dao;

import java.util.ArrayList;
import java.util.Arrays;

import javax.transaction.SystemException;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.emp.bean.EmployeeInfoBean;
import com.covalense.emp.util.Hibernatutil;

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
		EmployeeInfoBean bean;
		try(Session session=Hibernatutil.openSession();){
			bean=session.get(EmployeeInfoBean.class, id);
		}
		return bean;
	}
	private boolean saveorUpdate(EmployeeInfoBean bean) throws IllegalStateException, SystemException {
		Transaction txn=null;
		try(Session session=Hibernatutil.openSession();){
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
