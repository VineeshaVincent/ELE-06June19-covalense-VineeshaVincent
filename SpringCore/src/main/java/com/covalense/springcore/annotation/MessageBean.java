package com.covalense.springcore.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MessageBean {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	@PostConstruct
	public void init() {
		System.out.println("Init phase...");
	}
	
	
	@PreDestroy
	public void distroy() {
		System.out.println("Distroy phase...");
	}
}
