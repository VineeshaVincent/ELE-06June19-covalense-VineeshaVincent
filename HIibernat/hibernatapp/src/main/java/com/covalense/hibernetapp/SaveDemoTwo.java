package com.covalense.hibernetapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernetapp.dto.EmployeeInfoBean;
import com.covalense.hibernetapp.dto.EmployeeOtherInfoBean;

public class SaveDemoTwo {

	public static void main(String[] args) throws ParseException {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml ");
		//cfg.addAnnotatedClass(EmployeeOtherInfoBean.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		EmployeeOtherInfoBean empinfo=new EmployeeOtherInfoBean();
		empinfo.setId(104);
		empinfo.setPan_no("BsRvp2345");
		empinfo.setIsmarried(false);
		empinfo.setBlood_grp("ab+ve");
		empinfo.setIschallenged(false);
		empinfo.setEmergency_contact_number(887965456);
		empinfo.setEmergency_contact_person("divakar");
		empinfo.setNationality("india");
		empinfo.setReligion("hindhu");
		empinfo.setFather_nm("vinodh");
		empinfo.setFather_nm("jasmin");
		empinfo.setSpouse_nm("no");
		empinfo.setPassport("7869094445");
		empinfo.setAdhar(589554);
		
		Transaction transaction= session.beginTransaction();
		session.save(empinfo);
		transaction.commit();
		session.close();
			
		
	}//End of main
}//Enof class
