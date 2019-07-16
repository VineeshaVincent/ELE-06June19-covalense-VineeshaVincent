package com.covalense.springcore.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.extern.java.Log;
@Log
public class EmployeeBean implements InitializingBean,DisposableBean{

	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public void destroy() throws Exception {
	log.info("Initialization phase");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("disposible phase");
		
	}
	
}
