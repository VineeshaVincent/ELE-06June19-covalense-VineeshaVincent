package com.covalense.empspringrest.dao;

import java.util.ArrayList;

import com.covalense.empspringrest.dto.EmployeeInfoBean;


public interface EmployeeDAO {
	ArrayList<EmployeeInfoBean> getAllEmployeeInfo(String id);
	EmployeeInfoBean getEmployeeInfo(String id);
	EmployeeInfoBean getEmployeeInfo(int id) ;
	
	boolean createEmployeeInfo(EmployeeInfoBean emp);
	boolean updateEmployeeInfo(EmployeeInfoBean emp);
	boolean deleteEmployeeInfo(String id);
	boolean deleteEmployeeInfo(int id);
	ArrayList<EmployeeInfoBean> getAllEmployeeInfo();
}//End of Interface
