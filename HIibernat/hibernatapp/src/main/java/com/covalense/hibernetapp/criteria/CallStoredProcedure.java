package com.covalense.hibernetapp.criteria;

import java.util.List;

import javax.persistence.StoredProcedureQuery;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.covalense.hibernetapp.dto.EmployeeInfoBean;
import com.covalense.hibernetapputil.Hibernatutil;

import lombok.extern.java.Log;
@Log
public class CallStoredProcedure {

	public static void main(String[] args) {
		
		SessionFactory factory=Hibernatutil.getSessionFactory();
		Session session=factory.openSession();
	StoredProcedureQuery query=session.createStoredProcedureCall("sp1",EmployeeInfoBean.class);
	List<EmployeeInfoBean> employee=query.getResultList();
	for (EmployeeInfoBean employeeInfoBean : employee) {
	log.info("id is"+employeeInfoBean.getId());
	log.info("name is"+employeeInfoBean.getName());
	}
}
}