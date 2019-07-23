package com.covalense.hibernetapp.awsrds;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernetapp.cache.NewEmployeeInfoBean;
import com.covalense.hibernetapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;
@Log
public class HibernateForAws {

	public static void main(String[] args) throws ParseException {
		
		Transaction transaction=null;
		NewEmployeeInfoBean empinfo=new NewEmployeeInfoBean();
		empinfo.setId(104);
		empinfo.setName("abhishek");
		empinfo.setAge(24);
		empinfo.setGender("male");
		empinfo.setSalary(50000000.90);
		empinfo.setPhone(887965456);
		SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd");
		Date date=format.parse("2012-03-05");
		Date dob=format.parse("1998-01-11");
		empinfo.setJoining_date(date);
		empinfo.setAccount_number(5111);
		empinfo.setEmail("abhishek@gmail.com");
		empinfo.setDesignation("developer");
		empinfo.setDob(dob);
		empinfo.setDept_id(80);
		empinfo.setMngr_id(104);
		
		
		
			
	}
}
