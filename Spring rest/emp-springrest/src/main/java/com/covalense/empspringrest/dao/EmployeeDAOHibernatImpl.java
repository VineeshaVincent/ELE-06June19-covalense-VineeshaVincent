package com.covalense.empspringrest.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.covalense.empspringrest.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class EmployeeDAOHibernatImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionfactory;

	@Override
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo(String id) {
		Session session = sessionfactory.openSession();
		String hql = "from EmployeeInfoBean where str(id) like '" + id + "%'";
		Query query = session.createQuery(hql);
		ArrayList<EmployeeInfoBean> lstBean = (ArrayList<EmployeeInfoBean>) query.list();
		return lstBean;
	}// End of getAllEmployeeInfo()

	@Override
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		Session session = sessionfactory.openSession();

		String query = "from EmployeeInfoBean";
		Query<EmployeeInfoBean> empList = session.createQuery(query);
		ArrayList<EmployeeInfoBean> list = (ArrayList<EmployeeInfoBean>) empList.list();

		for (EmployeeInfoBean empbean : list) {

			log.info("Id is " + empbean.getId());
			log.info("name is " + empbean.getName());
			log.info("phone is " + empbean.getPhone());
			log.info("Age is " + empbean.getAge());
			log.info("Salary is " + empbean.getSalary());
			log.info("Account no is " + empbean.getAccount_number()); // log.info("DOB is " + empbean.getDob());
			log.info("Designation is " + empbean.getDesignation());
			// log.info("Dept ID is " + empbean.getDept_ID());
			// log.info("Manager ID is " + empbean.getManager_ID());

		}
		return list;
	}// End of getAllEmployee()

	public List<EmployeeInfoBean> searchLikeEmployee(String id) {
		Session session = sessionfactory.openSession();
		EmployeeInfoBean bean;

		String query = "from EmployeeInfoBean where str(id) like :id";

		Query empList = session.createQuery(query);
		empList.setParameter("id", id + "%");
		List<EmployeeInfoBean> list = empList.list();

		return list;
	}// End of searchLikeEmployee()

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		Session session = null;
		Transaction txn = null;
		try {
			session = sessionfactory.openSession();
			txn = session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			e.getStackTrace();
			if (txn != null) {
				txn.rollback();
			}
		}
		session.close();

		return false;
	}// End of createEmployee()

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {
		EmployeeInfoBean readInfo;
		try (Session session = sessionfactory.openSession();) {
			readInfo = session.get(EmployeeInfoBean.class, id);
		}
		return readInfo;
	}// End of getEmployeeInfo()

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {

		return getEmployeeInfo(Integer.parseInt(id));
	}// End of getEmployeeInfo()

	private boolean saveOrUpdate(EmployeeInfoBean bean) {
		Transaction txn = null;
		try {
			Session session = sessionfactory.openSession();
			txn = session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}// End of updateEmployeeInfo()

	@Override
	public boolean deleteEmployeeInfo(int id) {
		Transaction txn = null;
		//EmployeeInfoBean bean=new EmployeeInfoBean();
		//bean.setId(id);
		try {
			Session session = sessionfactory.openSession();
			EmployeeInfoBean bean=getEmployeeInfo(id);
			txn = session.beginTransaction();			
			session.delete(bean);
			txn.commit();
			return true;
		}catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}
		
	}// End of deleteEmployeeInfo()

	@Override
	public boolean deleteEmployeeInfo(String id) {
		return deleteEmployeeInfo(Integer.parseInt(id));
	}// End of deleteEmployeeInfo()

}
