package com.covalense.jdbc.connectionpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.covalense.jdbc.connectionpool.ConnectionPool;
import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;
@Log
 public  final class ConnectionpoolTest {

	public static void main(String[] args) {
		ConnectionpoolTest ref=new ConnectionpoolTest();
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		ConnectionPool pool=null;
		//1.Load the"Driver"
		try {
			/*java.sql.Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.deregisterDriver(driver);*/
			try {
				pool=ConnectionPool.getConnectionpool();
				con=pool.getConnectionFrompool();
				//Class.forName("com.mysql.jdbc.Driver").newInstance();
			} catch (Exception e) {
				e.printStackTrace();
			} 
		
			//2. Get the db connection via driver
			//String dbUrl="jdbc:mysql://localhost:3306/covalense_db?user=root&password=root";
			//con=DriverManager.getConnection(dbUrl);
			//String dbUrl="jdbc:mysql://localhost:3306/covalense_db";
			
			 //con=DriverManager.getConnection(dbUrl,"root","root");
			
			log.info("connection Impl class=======>"+con.getClass());
			//3.Issue "SQL Queries " via "connection
			String query="select*from employee_info ";
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			
			
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
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			//5.close all "JDBC Objects"
			try {
				pool.returnconnectionToPool(con);
				/*if(con!=null) {
					con.close();*/
				if(stmt!=null) {
					stmt.close();
				}if(rs!=null) {
					rs.close();
				}
		} catch (Exception e){
		}
	
		
		
		}
		
	}//End of main
	
}//End of class
