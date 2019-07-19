package com.covalense.mywebapp.dao;

import java.util.ArrayList;

import com.covalense.mywebapp.bean.EmployeeInfoBean;

public interface EmployeeDAO {
	ArrayList<EmployeeInfoBean> getAllEmployeeInfo();
	EmployeeInfoBean getEmployeeInfo(String id);
	EmployeeInfoBean getEmployeeInfo(int id) ;
	boolean createemployee(EmployeeInfoBean emp);
}//End of Interface
