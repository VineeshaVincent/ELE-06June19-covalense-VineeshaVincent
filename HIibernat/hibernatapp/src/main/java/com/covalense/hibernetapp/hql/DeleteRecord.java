package com.covalense.hibernetapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernetapputil.Hibernatutil;

import lombok.extern.java.Log;
@Log
public class DeleteRecord {
	public static void main(String[] args) {
		
		SessionFactory factory=Hibernatutil.getSessionFactory();
		Session session=factory.openSession();
	
		//String hql="delete from EmployeeInfoBean  where id=6";
		
		//delete the data using dynamicly
		String hql="delete from EmployeeInfoBean  where id=:eid";
		Query query=session.createQuery(hql);
		query.setParameter("eid",104 );
		Transaction transaction=null;
		try {
			 transaction=session.beginTransaction();
			int result=query.executeUpdate();
			log.info("deleted record------------"+result);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			session.close();
		}
	}
}
