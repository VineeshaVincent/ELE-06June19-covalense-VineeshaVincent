package com.covalense.hibernetapp.criteria;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.covalense.hibernetapp.dto.EmployeeInfoBean;
import com.covalense.hibernetapputil.Hibernatutil;

import lombok.extern.java.Log;
@Log
public class GetDataWithProjection {

	public static void main(String[] args) {
		
		SessionFactory factory=Hibernatutil.getSessionFactory();
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(EmployeeInfoBean.class);
		Projection pro=Projections.property("name");
		Projection pro1=Projections.property("id");
		Projection pro2=Projections.property("age");
		ProjectionList projectionList=Projections.projectionList();
		projectionList.add(pro);
		projectionList.add(pro1);
		projectionList.add(pro2);
		
		criteria.setProjection(projectionList);
		
		List<Object[]>str=criteria.list();
		for(Object[]object:str) {
			log.info("name is"+object[0]);
			log.info("id is"+object[1]);
			log.info("age is"+object[2]);
		}
		/*List<String>emp=criteria.list();
		for (String Emp: emp) {
			
			log.info("name is"+Emp);*/
			
	}
}

