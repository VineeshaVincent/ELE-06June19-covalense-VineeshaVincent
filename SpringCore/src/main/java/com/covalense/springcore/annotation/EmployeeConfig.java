package com.covalense.springcore.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

 
@Configuration
@Import(DeptConfig.class)

public class EmployeeConfig {
	
	@Bean
	public EmployeeThree getEmployeeThree() {
	
	EmployeeThree employeethree=new EmployeeThree();
	
	employeethree.setName("Liiisa");
	employeethree.setId(100);
	
	return employeethree;
	}

}
