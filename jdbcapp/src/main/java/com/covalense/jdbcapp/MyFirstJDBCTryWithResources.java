package com.covalense.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;
@Log
public class MyFirstJDBCTryWithResources {

	public static void main(String[] args) {
		String query="select*from employee_info ";
		String dbUrl="jdbc:mysql://localhost:3306/covalense_db";
		

		
			try(Connection con=DriverManager.getConnection(dbUrl,"root","root");
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(query);) {
				
				//load driver
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
						
			//4."Process the Results "returned by"SQL Queries
			while(rs.next()) {
				//log.info("ID  	 		===> "+rs.getInt("id"));
				//log.info("NAME   			===> "+rs.getString("name"));
				
				log.info("ID  	 			===> "+rs.getInt(1));
				log.info("NAME   			===> "+rs.getString(2));
				log.info("AGE  				===> "+rs.getInt("age"));
				log.info("GENDER  			===> "+rs.getString("gender"));
				log.info("SALARY   	 		===> "+rs.getDouble("salary"));
				log.info("PHONE   			===> "+rs.getLong("phone"));
				log.info("JOINING_DATE		===> "+rs.getDate("joining_date"));
				log.info("ACCOUNT_NUMBER 	===> "+rs.getInt("account_number"));
				log.info("EMAIL   			===> "+rs.getString("email"));
				log.info("DESIGNATION 		===> "+rs.getString("designation"));
				log.info("DOB  				===> "+rs.getDate("dob"));
				log.info("DEPT_ID 			===> "+rs.getInt("dept_id"));
				log.info("MNGR_ID			===> "+rs.getInt("mngr_id"));
				
				
				
			}//end of while
		} catch (SQLException|InstantiationException|IllegalAccessException|ClassNotFoundException e) {
			e.printStackTrace();
		} 
	
		
	}//End of main
}//End of class
