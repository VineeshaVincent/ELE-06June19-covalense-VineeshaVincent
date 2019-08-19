package com.covalense.springboot.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.springboot.dto.EmployeeAddressInfoBean;
import com.covalense.springboot.dto.EmployeeEducationalInfoBean;
import com.covalense.springboot.dto.EmployeeExperienceInfoBean;
import com.covalense.springboot.dto.EmployeeInfoBean;
import com.covalense.springboot.dto.EmployeeOtherInfoBean;
import com.covalense.springboot.dto.EmployeeResponse;
import com.covalense.springboot.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository repository;
	
	
	@GetMapping(path = "/hello",produces = MediaType.TEXT_PLAIN_VALUE)
	public String helloworld() {
		return "helloworld!!!!!";
	}
	@PostMapping(path = "/create",
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse createEmployee(@RequestBody EmployeeInfoBean bean) {
		bean.getEmployeeOtherInfoBean().setInfobean(bean);
		
		for (EmployeeAddressInfoBean addressInfoBean : bean.getAddressInfoBean()) {
			addressInfoBean.getAddressPKBean().setInfobean(bean);
		}

		for (EmployeeEducationalInfoBean educationalInfoBean : bean.getEducationalInfoBean()) {
			educationalInfoBean.getEducationalPKBean().setInfobean(bean);
		}

		for (EmployeeExperienceInfoBean experienceInfoBean : bean.getExperienceInfoBean()) {
			experienceInfoBean.getExperiencePKBean().setInfobean(bean);
		
		}
		EmployeeInfoBean manager=bean.getMngr_Id();
		if(manager!=null) {
		manager=repository.findById(manager.getId()).get();
		bean.setMngr_Id(manager);
		}
	
		EmployeeResponse response=new EmployeeResponse();
		if(!repository.existsById(bean.getId())) {
		repository.save(bean);
		response.setStatusCode(201);
		response.setMessage("********Successfull*****");
		response.setDescription("Employee data added Successfully!!!!!");
		
	}else {
		response.setStatusCode(202);
		response.setMessage("********Failed*******");
		response.setDescription("Employee data not added To the DB!!!!!");

	}
		return response;
	}
	@GetMapping(path = "/get",produces =MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(int id,HttpServletRequest request) {

	EmployeeResponse response=new EmployeeResponse();
	if(request.getSession(false) !=null) {
		EmployeeInfoBean bean =repository.findById(id).get();
		if(bean!=null) {
		response.setStatusCode(201);
		response.setMessage("********Successfull*****");
		response.setDescription("Employee data found Successfully!!!!!");
		response.setInfoBeans(Arrays.asList(bean));
	}else {
		response.setStatusCode(202);
		response.setMessage("********Failed*******");
		response.setDescription("Employee data not found Successfully!!!!!");
	}
	return response;	
}else {
	response.setStatusCode(203);
	response.setMessage("Failure!!!!");
	response.setDescription("Please login first!!!!!!!!!!");
	return response;
}
	
}//End of Get Employee


	@PostMapping(path = "/update",
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse updateEmployee(@RequestBody EmployeeInfoBean bean,HttpServletRequest request) {
bean.getEmployeeOtherInfoBean().setInfobean(bean);
		
		for (EmployeeAddressInfoBean addressInfoBean : bean.getAddressInfoBean()) {
			addressInfoBean.getAddressPKBean().setInfobean(bean);
		}

		for (EmployeeEducationalInfoBean educationalInfoBean : bean.getEducationalInfoBean()) {
			educationalInfoBean.getEducationalPKBean().setInfobean(bean);
		}

		for (EmployeeExperienceInfoBean experienceInfoBean : bean.getExperienceInfoBean()) {
			experienceInfoBean.getExperiencePKBean().setInfobean(bean);
		
		}
		EmployeeInfoBean manager=bean.getMngr_Id();
		if(manager!=null) {
		manager=repository.findById(manager.getId()).get();
		bean.setMngr_Id(manager);
		}
		
		EmployeeResponse response=new EmployeeResponse();
		if(request.getSession(false) !=null) {
		if(repository.existsById(bean.getId())) {
			bean.getEmployeeOtherInfoBean().setOtherInfoid
			(repository.findByEmpId(bean).
					getOtherInfoid());
			repository.save(bean);
			response.setStatusCode(401);
			response.setMessage("********Successfull*****");
			response.setDescription("Employee data updated Successfully!!!!!");
			
		}else {
			response.setStatusCode(402);
			response.setMessage("********Failed*******");
			response.setDescription("Employee data not updated To the DB!!!!!");

		}
			return response;
		}else {
			response.setStatusCode(752);
			response.setMessage("Failure!!!!");
			response.setDescription("Please login first!!!!!!!!!!");
			return response;
		}
		
	}
	@GetMapping(value = "/search",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse searchEmployee(int id) {
		EmployeeInfoBean bean=repository.findById(id).get();
		EmployeeResponse response=new EmployeeResponse();
		if(bean!=null) {
			response.setStatusCode(501);
			response.setMessage("********Successfull*****");
			response.setDescription("Employee data found Successfully!!!!!");
			response.setInfoBeans(Arrays.asList(bean));
			
		}else {
			response.setStatusCode(502);
			response.setMessage("********Failed*******");
			response.setDescription("Employee data not found successfully!!!");

		}
			return response;
		}
		
	
		
	
	@DeleteMapping(path="/delete",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(int id,HttpServletRequest request) {
	EmployeeResponse response=new EmployeeResponse();
	if(request.getSession(false) !=null) {
	if(repository.existsById(id)) {
		repository.deleteById(id);
		response.setStatusCode(501);
		response.setMessage("********Successfull*****");
		response.setDescription("Employee data deleted Successfully!!!!!");
		
	}else {
		response.setStatusCode(502);
		response.setMessage("********Failed*******");
		response.setDescription("Employee data not deleted successfully!!!");

	}
		return response;
	}else {
		response.setStatusCode(203);
		response.setMessage("Failure!!!!");
		response.setDescription("Please login first!!!!!!!!!!");
		return response;
	}
}//E
	@GetMapping(value = "/getotherinfo",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeOtherInfoBean getOtherInfo(int id) {
		EmployeeInfoBean bean=new EmployeeInfoBean();
		bean.setId(id);
		return repository.findByEmpId(bean);
	}
	
	@PostMapping(value="/auth",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse login(int id,String password,HttpServletRequest request) {
	EmployeeInfoBean bean=repository.findById(id).get();
		EmployeeResponse response=new EmployeeResponse();
		if(bean!=null&&bean.getPassword().equals(password)) {
			response.setStatusCode(201);
			response.setMessage("Success!!!!");
			response.setDescription("Logged In Successfully");
			response.setInfoBeans(Arrays.asList(bean));
			request.getSession().setAttribute("bean", bean);
		}else {
			response.setStatusCode(202);
			response.setMessage("Failure!!!!");
			response.setDescription("Invalid credentials");
		}
		return response;
	}
	@GetMapping(value = "/logout",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse logout(HttpSession session) {
		session.invalidate();
		EmployeeResponse response=new EmployeeResponse();
		response.setStatusCode(301);
		response.setMessage("Success!!!!");
		response.setDescription("Logged Out Successfully");
		return response;
	}
	@GetMapping(value = "/readCookie",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse readCookie(@CookieValue(name = "JSESSIONID")String sessionId) {
		EmployeeResponse response=new EmployeeResponse();
		response.setStatusCode(301);
		response.setMessage("Success!!!!");
		response.setDescription("JSESSIONID: "+ sessionId);
		return response;
	}
	}

