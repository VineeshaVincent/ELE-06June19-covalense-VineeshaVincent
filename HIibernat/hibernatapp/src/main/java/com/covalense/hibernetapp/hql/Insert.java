package com.covalense.hibernetapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernetapputil.Hibernatutil;

import lombok.extern.java.Log;
@Log
public class Insert {

	
	public static void main(String[] args) {
		
		Transaction transaction=null;
		
		SessionFactory factory=Hibernatutil.getSessionFactory();
		Session session=factory.openSession();
		String hql="insert into EmployeeNewInfo(eid,ename,email) select id,name,email from EmployeeInfoBean where id=1";
				
		try {
			transaction=session.beginTransaction();
			Query query=session.createQuery(hql);
			int result=query.executeUpdate();
			log.info("Updated record------------"+result);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			session.close();
		}
	}
}
