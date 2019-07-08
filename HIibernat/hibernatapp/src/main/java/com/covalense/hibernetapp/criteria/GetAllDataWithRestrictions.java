package com.covalense.hibernetapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.covalense.hibernetapp.dto.EmployeeInfoBean;
import com.covalense.hibernetapputil.Hibernatutil;

import lombok.extern.java.Log;
@Log
public class GetAllDataWithRestrictions {

	public static void main(String[] args) {
		
		SessionFactory factory=Hibernatutil.getSessionFactory();
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(EmployeeInfoBean.class).add(Restrictions.gt("salary",10000.00))
				.add(Restrictions.gt("id",2));
		//Criterion cr=Restrictions.eq("id", 3);
		//criteria.add(cr);
		//EmployeeInfoBean emp=(EmployeeInfoBean) criteria.uniqueResult();
		List<EmployeeInfoBean>emp1=criteria.list();
		for (EmployeeInfoBean employeeInfoBean : emp1) {
			log.info("id is"+employeeInfoBean.getId());
			log.info("salary is"+employeeInfoBean.getSalary());
			
		}
}
}
