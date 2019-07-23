package com.covalense.hibernateapp.onetoone;

import java.util.Arrays;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.covalense.hibernetapputil.Hibernatutil;
import com.covalense.hibernetapputil.PrepareDataUtil;

import lombok.extern.java.Log;
@Log
public class HibernateOneToOneTest {
public static void main(String[] args) {
	
int id=1001;
EmployeeInfoBean data=PrepareDataUtil.prepareData(id);
save(data);

}//End of main
private static void save(EmployeeInfoBean data) {
	//save
	Transaction txn=null;
	try(Session session=(Session)Hibernatutil.getSessionFactory()){
		txn=session.beginTransaction();
		session.save(data);
		txn.commit();
	}catch(Exception ex) {
		log.severe(Arrays.toString(ex.getStackTrace()));
		if(txn!=null) {
			txn.rollback();
		}
	}
}//End of save
}//End of class