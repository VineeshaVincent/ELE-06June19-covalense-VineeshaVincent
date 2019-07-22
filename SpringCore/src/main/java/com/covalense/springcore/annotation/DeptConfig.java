package com.covalense.springcore.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeptConfig {
	
	@Bean (name="it")
	public Dept getit() {
		Dept dept=new Dept();
		dept.setDeptId(560);
		dept.setDeptName("it");
		
		return dept;
	}
	@Bean (name="hr")
	public Dept gethr() {
		Dept dept=new Dept();
		dept.setDeptId(123);
		dept.setDeptName("hr");
		
		return dept;
	}
	@Bean (name="testing")
	public Dept gettesting() {
		Dept dept=new Dept();
		dept.setDeptId(456   );
		dept.setDeptName("testing");
		
		return dept;
	}
}
