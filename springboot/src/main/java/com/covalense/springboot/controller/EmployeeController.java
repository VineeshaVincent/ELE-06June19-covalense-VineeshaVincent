package com.covalense.springboot.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.springboot.dto.EmployeeAddressInfoBean;
import com.covalense.springboot.dto.EmployeeEducationalInfoBean;
import com.covalense.springboot.dto.EmployeeExperienceInfoBean;
import com.covalense.springboot.dto.EmployeeInfoBean;
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
		manager=repository.findById(manager.getId()).get();
		bean.setMngr_Id(manager);
		
	
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
	public EmployeeResponse getEmployee(int id) {

	EmployeeResponse response=new EmployeeResponse();
	if(repository.existsById(id)) {
		EmployeeInfoBean bean =repository.findById(id).get();
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
	
	
}

	@PostMapping(path = "/update",
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse updateEmployee(EmployeeInfoBean bean) {
		EmployeeResponse response=new EmployeeResponse();
		if(repository.existsById(bean.getId())) {
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
		}
	@DeleteMapping(path="/delete",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(int id) {
	EmployeeResponse response=new EmployeeResponse();
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
	}
	}

