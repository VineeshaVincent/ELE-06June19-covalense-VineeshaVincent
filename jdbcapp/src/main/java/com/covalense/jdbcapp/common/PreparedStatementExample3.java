package com.covalense.jdbcapp.common;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public class PreparedStatementExample3 {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		PreparedStatement pstmt=null;
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
					+ "(?,?,?,?,?,?,?,?,"
					+ "?,?,?,?,?)";
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			pstmt.setString(2,(args[1]));
			pstmt.setInt(3, Integer.parseInt(args[2]));
			pstmt.setString(4, (args[3]));
			pstmt.setDouble(5, Double.parseDouble(args[4]));
			pstmt.setLong(6, Long.parseLong (args[5]));
			pstmt.setString(7,(args[6]));
			pstmt.setInt(8, Integer.parseInt (args[7]));
			pstmt.setString(9,(args[8]));
			pstmt.setString(10,(args[9]));
			pstmt.setString(11,(args[10]));
			pstmt.setInt(12, Integer.parseInt (args[11]));
			pstmt.setInt(13, Integer.parseInt(args[12]));
			
			
			
			
		
			int rs11=pstmt.executeUpdate();
			log.info(""+rs11);
			
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
