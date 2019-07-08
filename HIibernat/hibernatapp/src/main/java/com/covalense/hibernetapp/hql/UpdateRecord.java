package com.covalense.hibernetapp.hql;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernetapputil.Hibernatutil;

import lombok.extern.java.Log;
@Log
public class UpdateRecord {

	public static void main(String[] args) {
		
		SessionFactory factory=Hibernatutil.getSessionFactory();
		Session session=factory.openSession();
		//String hql="update from EmployeeInfoBean set name='filu' where id=1";
		
		//update the value dynamically
		//String hql="update from EmployeeInfoBean set name=:ename where id=:eid";
		String hql="update from EmployeeInfoBean set name='"+ args[0]+"'"
				+ "where id="+args[1]+"";
		Query query=session.createQuery(hql);
		
		  //query.setParameter("eid",7 ); 
		  //query.setParameter("ename","kaarthu" );
		
		//query.setParameter("eid", args[0]);
		//query.setParameter("ename", args[1]);
		Transaction transaction=null;
		try {
			 transaction=session.beginTransaction();
			int result=query.executeUpdate();
			log.info("Updated record------------"+result);
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
