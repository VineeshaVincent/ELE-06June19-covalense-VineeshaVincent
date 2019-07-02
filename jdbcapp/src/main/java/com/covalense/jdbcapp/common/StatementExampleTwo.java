package com.covalense.jdbcapp.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;
@Log
public class StatementExampleTwo {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		StatementExample1 ref=new  StatementExample1();
		//1.Load the"Driver"
		try {
			/*java.sql.Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.deregisterDriver(driver);*/
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
			} catch (InstantiationException |IllegalAccessException |ClassNotFoundException e
					) {
				e.printStackTrace();
			} 
		
			//2. Get the db connection via driver
			String dbUrl="jdbc:mysql://localhost:3306/covalense_db";
			con=DriverManager.getConnection(dbUrl,"root","root");
			
		
			//3.Issue "SQL Queries " via "connection
			String query="insert into employee_info values"
					+ "(6,'ragav',33,'male',348900.90,5678097655,'2016-02-19',56780,"
					+ "'ragav@gmail.com','designer','1997-02-10',45,400)";
			stmt=con.createStatement();
			int rs1=stmt.executeUpdate(query);
			log.info(""+rs1);
			
			//4."Process the Results "returned by"SQL Queries
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//5.close all "JDBC Objects"
			try {
				if(con!=null) {
					con.close();
				}if(stmt!=null) {
					stmt.close();
				}if(rs!=null) {
					rs.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
		}
	
	
		
		}
}
}
