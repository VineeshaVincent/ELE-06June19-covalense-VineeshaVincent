package com.covalense.empspringrest.controller;

import static com.covalense.empspringrest.commons.EMPConstants.PROPERTY_FILE;


import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.empspringrest.dao.EmployeeDAO;
import com.covalense.empspringrest.dto.EmployeeAddressInfoBean;
import com.covalense.empspringrest.dto.EmployeeEducationalInfoBean;
import com.covalense.empspringrest.dto.EmployeeExperienceInfoBean;
import com.covalense.empspringrest.dto.EmployeeInfoBean;
import com.covalense.empspringrest.dto.EmployeeResponse;


@RestController
@PropertySource(PROPERTY_FILE)
public class EmployeeRestController {

	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;

	public @ResponseBody boolean deleteEmployee(@RequestParam("id") String id) {
		return dao.deleteEmployeeInfo(id);
	}

	@PostMapping(path = "createEmployee",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse createEmployee(@RequestBody EmployeeInfoBean empBean) {
		
		EmployeeResponse response=new EmployeeResponse();
		
		List<EmployeeEducationalInfoBean> eduBeans = empBean.getEducationalInfoBean();
		List<EmployeeAddressInfoBean> addrBeans = empBean.getAddressInfoBean();
		List<EmployeeExperienceInfoBean> expBeans = empBean.getExperienceInfoBean();
		
		for (EmployeeAddressInfoBean employeeAddressInfoBean : addrBeans) {
		employeeAddressInfoBean.getAddressPKBean().setInfobean(empBean);
		}

		for (EmployeeEducationalInfoBean employeeEduInfoBean : eduBeans) {
		employeeEduInfoBean.getEducationalPKBean().setInfobean(empBean);
		}

		for (EmployeeExperienceInfoBean employeeExperienceInfoBean : expBeans) {
		employeeExperienceInfoBean.getExperiencePKBean().setInfobean(empBean);
		


		empBean.getEmployeeOtherInfoBean().setInfobean(empBean);

		if(dao.createEmployeeInfo(empBean)) {
			response.setStatusCode(560);
			response.setMessage("Successfull!!!!");
			response.setDescription("The Employeee Data Inserted Successfully");
		}else {
			response.setStatusCode(561);
			response.setMessage("Failure!!!!");
			response.setDescription("The Employeee Data Not Inserted Successfully");
		}
		//return dao.createEmployeeInfo(bean);
		}
		return response;
	}
	
	
	@PostMapping(path = "/updateEmployee",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse  updateEmployee(@RequestBody EmployeeInfoBean bean,HttpServletRequest request) {
		
		
		EmployeeResponse response=new EmployeeResponse();
		if(request.getSession(false) !=null) {
		if(dao.updateEmployeeInfo(bean)) {
			response.setStatusCode(750);
			response.setMessage("Successfull!!!!");
			response.setDescription("The Employeee Data Updated Successfully");
		}else {
			response.setStatusCode(751);
			response.setMessage("Failure!!!!");
			response.setDescription("The Employeee Data Not Updated Successfully");
		}
		return response;
		
		}else {
			response.setStatusCode(752);
			response.setMessage("Failure!!!!");
			response.setDescription("Please login first!!!!!!!!!!");
			return response;
		}
		
	}
	
	@GetMapping(path="/getEmployee",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(int id,HttpServletRequest request) {
		
		
		EmployeeResponse response=new EmployeeResponse();
		if(request.getSession(false) !=null) {
		EmployeeInfoBean bean=dao.getEmployeeInfo(id);
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("Success!!!!");
			response.setDescription("The Employeee Data found Successfully");
			response.setInfoBeans(Arrays.asList(bean));
		}else {
			response.setStatusCode(202);
			response.setMessage("Failure!!!!");
			response.setDescription("The Employeee Data Not found Successfully");
		}
		return response;
	}else {
		response.setStatusCode(203);
		response.setMessage("Failure!!!!");
		response.setDescription("Please login first!!!!!!!!!!");
		return response;
	}
		
	}//End of Get Employee

	/*
	 * public @ResponseBody EmployeeInfoBean getEmployee(int id){ return
	 * dao.getEmployeeInfo(id); }
	 */
	
	
	@GetMapping(path="/getAllEmployee",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee(HttpServletRequest request) {
		List<EmployeeInfoBean> beans=dao.getAllEmployeeInfo();
		EmployeeResponse response=new EmployeeResponse();
		if(request.getSession(false) !=null) {
		if(beans!=null) {
			response.setStatusCode(201);
			response.setMessage("Success!!!!");
			response.setDescription("The Employeee Data found Successfully");
			response.setInfoBeans(beans);
		}else {
			response.setStatusCode(202);
			response.setMessage("Failure!!!!");
			response.setDescription("The Employeee Data Not found Successfully");
		}
		return response;
		}
		else {
			response.setStatusCode(203);
			response.setMessage("Failure!!!!");
			response.setDescription("Please login first!!!!!!!!!!");
			return response;
		}
		
	}//End of Get Employee
		
	
	/*
	 * public @ResponseBody ArrayList<EmployeeInfoBean> getAllEmployee(){ return
	 * dao.getEmployeeInfo(); }
	 */
	
	@DeleteMapping(path = "/removeEmployee",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody EmployeeResponse removeEmployee(@RequestParam("id") String id,HttpServletRequest request) {
		EmployeeResponse response=new EmployeeResponse();
		if(request.getSession(false) !=null) {
		if(dao.deleteEmployeeInfo(id)) {
			response.setStatusCode(800);
			response.setMessage("Successfull!!!!");
			response.setDescription("The Employeee Data removed Successfully");
		}else {
			response.setStatusCode(801);
			response.setMessage("Failure!!!!");
			response.setDescription("The Employeee Data Not removed Successfully");
		}
		return response;
		
	}else {
		response.setStatusCode(203);
		response.setMessage("Failure!!!!");
		response.setDescription("Please login first!!!!!!!!!!");
		return response;
	}
}//End of removeEmployee
}