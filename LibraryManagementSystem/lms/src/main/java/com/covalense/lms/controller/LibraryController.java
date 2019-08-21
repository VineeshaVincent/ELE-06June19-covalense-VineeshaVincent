package com.covalense.lms.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.lms.dto.LibraryResponse;
import com.covalense.lms.dto.UserBean;
import com.covalense.lms.repository.LibraryRepository;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class LibraryController {
	@Autowired
	LibraryRepository repository;
	
	@PostMapping(value="/auth",produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse login(Integer userId,String password,HttpServletRequest request) {
	UserBean bean=repository.findById(userId).get();
	LibraryResponse response=new LibraryResponse();
		if(bean!=null&&bean.getPassword().equals(password)) {
			response.setStatusCode(201);
			response.setMessage("Success!!!!");
			response.setDescription("Logged In Successfully");
			response.setUserBeans(Arrays.asList(bean));
			request.getSession().setAttribute("bean", bean);
		}else {
			response.setStatusCode(202);
			response.setMessage("Failure!!!!");
			response.setDescription("Invalid credentials");
		}
		return response;
	}
}
