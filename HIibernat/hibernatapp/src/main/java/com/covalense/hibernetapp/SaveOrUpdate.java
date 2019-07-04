package com.covalense.hibernetapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernetapp.dto.EmployeeInfoBean;

public class SaveOrUpdate {

	public static void main(String[] args) throws ParseException {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml ");
		//cfg.addAnnotatedClass(EmployeeInfoBean.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		EmployeeInfoBean empinfo=new EmployeeInfoBean();
		empinfo.setId(102);
		empinfo.setName("abhi");
		empinfo.setAge(24);
		empinfo.setGender("male");
		empinfo.setSalary(3000000.90);
		empinfo.setPhone(887965456);
		SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd");
		Date date=format.parse("2012-03-05");
		Date dob=format.parse("1998-01-11");
		empinfo.setJoining_date(date);
		empinfo.setAccount_number(5111);
		empinfo.setEmail("abhi@gmail.com");
		empinfo.setDesignation("tester");
		empinfo.setDob(dob);
		empinfo.setDept_id(80);
		empinfo.setMngr_id(104);
		
		Transaction transaction= session.beginTransaction();
		session.saveOrUpdate(empinfo);
		
		transaction.commit();
		session.close();
			
		
	}//End of main
}//Enof class
