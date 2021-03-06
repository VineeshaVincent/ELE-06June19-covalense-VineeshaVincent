package com.covalense.empspringrest.dao;

public class EmployeeDAOFactoryOld {

	private EmployeeDAOFactoryOld() {
	}

	private static String dbInteractionType = "hibernate";

	public static EmployeeDAO getInstance() {
		EmployeeDAO dao = null;

		/*
		 * if (dbInteractionType.equals("jdbc")) { dao = new EmployeeDAOJDBCImpl(); }
		 * else
		 */if (dbInteractionType.equals("hibernate")) {
			dao = new EmployeeDAOHibernatImpl();
		}
		return dao;

	}
	
	public static EmployeeDAO getInstance(String dbInteractionType) {
		EmployeeDAO dao = null;

		/*
		 * if (dbInteractionType.equals("jdbc")) { dao = new EmployeeDAOJDBCImpl(); }
		 * else
		 */if (dbInteractionType.equals("hibernate")) {
			dao = new EmployeeDAOHibernatImpl();
		}
		return dao;

	}

}// End of the class
