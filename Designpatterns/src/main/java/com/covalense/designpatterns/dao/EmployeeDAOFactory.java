package com.covalense.designpatterns.dao;

public class EmployeeDAOFactory {

	private EmployeeDAOFactory() {
	}

	private static String dbInteractionType = "jdbc";

	public static EmployeeDAO getInstance() {
		EmployeeDAO dao = null;

		if (dbInteractionType.equals("jdbc")) {
			dao = new EmployeeDAOJDBCImpl();
		} else if (dbInteractionType.equals("hibernate")) {
			dao = new EmployeeDAOHibernatImpl();
		}
		return dao;

	}

}// End of the class
