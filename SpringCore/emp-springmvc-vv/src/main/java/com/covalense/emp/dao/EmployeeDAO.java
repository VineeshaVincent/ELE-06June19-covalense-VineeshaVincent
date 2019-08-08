package com.covalense.emp.dao;

import java.util.ArrayList;

import com.covalense.emp.dto.EmployeeInfoBean;





public interface EmployeeDAO {
	ArrayList<EmployeeInfoBean> getAllEmployeeInfo();
	EmployeeInfoBean getEmployeeInfo(String id);
	EmployeeInfoBean getEmployeeInfo(int id) ;
	boolean createemployee(EmployeeInfoBean emp);
}//End of Interface
