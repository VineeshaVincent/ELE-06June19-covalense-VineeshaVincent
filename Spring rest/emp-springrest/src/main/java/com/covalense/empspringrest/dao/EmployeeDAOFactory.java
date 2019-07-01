package com.covalense.empspringrest.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOFactory {

	@Bean("hibernate")
	public EmployeeDAO getHIbernateInstance() {
		return new EmployeeDAOHibernatImpl();
	}

	@Bean("jdbc")
	public EmployeeDAO getJDBCInstance() {
		return new EmployeeDAOHibernatImpl();
	}
}
