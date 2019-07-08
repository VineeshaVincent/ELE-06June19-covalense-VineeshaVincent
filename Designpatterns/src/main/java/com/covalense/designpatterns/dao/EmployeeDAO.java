package com.covalense.designpatterns.dao;

import java.util.ArrayList;

import com.covalense.designpattens.bean.EmployeeInfoBean;

public interface EmployeeDAO {
	ArrayList<EmployeeInfoBean> getAllEmployeeInfo();
	EmployeeInfoBean getEmployeeInfo(String id);
	EmployeeInfoBean getEmployeeInfo(int id) ;
}//End of Interface
