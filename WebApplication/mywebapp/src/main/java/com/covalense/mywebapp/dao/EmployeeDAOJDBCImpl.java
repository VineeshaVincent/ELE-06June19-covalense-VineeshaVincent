package com.covalense.mywebapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.covalense.mywebapp.bean.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class EmployeeDAOJDBCImpl  implements EmployeeDAO{
public ArrayList<com.covalense.mywebapp.bean.EmployeeInfoBean> getAllEmployeeInfo() {
	
	String query="select*from employee_info ";
	String dbUrl="jdbc:mysql://localhost:3306/covalense_db";
		try(Connection con=DriverManager.getConnection(dbUrl,"root","root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);) {
			
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		ArrayList<com.covalense.mywebapp.bean.EmployeeInfoBean> beans=new ArrayList<>();
		while(rs.next()) {
			com.covalense.mywebapp.bean.EmployeeInfoBean bean=new com.covalense.mywebapp.bean.EmployeeInfoBean();
			bean.setId(rs.getInt("id"));
			bean.setName(rs.getString("name"));
			bean.setAge(rs.getInt("age"));
			bean.setGender(rs.getString("gender"));
			bean.setSalary(rs.getDouble("salary"));
			bean.setPhone(rs.getLong("phone"));
			bean.setJoining_date(rs.getDate("joining_date"));
			bean.setAccount_number(rs.getInt("account_number"));
			bean.setEmail(rs.getString("email"));
			bean.setDesignation(rs.getString("designation"));
			bean.setDob(rs.getDate("dob"));
			bean.setDept_id(rs.getInt("dept_id"));
			bean.setMngr_id(rs.getInt("mngr_id"));
			
			beans.add(bean);//adding to list
		}//end of while
		return beans;
	} catch (SQLException|InstantiationException|IllegalAccessException|ClassNotFoundException e) {
		e.printStackTrace();
		return null;
	} 
}
	public EmployeeInfoBean getEmployeeInfo(String id) {

		try {
			return getEmployeeInfo(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return null;
		}
	}// end ofgetEmployeeInfo(String id)

	public EmployeeInfoBean getEmployeeInfo(int id) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		try {
			// 1.Load the"Driver"
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			// 2. Get the db connection via driver
			String dbUrl = "jdbc:mysql://localhost:3306/covalense_db";
			con = DriverManager.getConnection(dbUrl, "root", "root");

			log.info("Connection details" + con.getClass());
			// 3.Issue "SQL Queries " via "connection
			String query = "select * from employee_info "
					+ "where id = ? ";
			log.info("" + query);
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, (id));
			rs = pstmt.executeQuery();

			// 4."Process the Results "returned by"SQL Queries
			EmployeeInfoBean bean=new EmployeeInfoBean();
			while (rs.next()) {
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setAge(rs.getInt("age"));
				bean.setGender(rs.getString("gender"));
				bean.setSalary(rs.getDouble("salary"));
				bean.setPhone(rs.getLong("phone"));
				bean.setJoining_date(rs.getDate("joining_date"));
				bean.setAccount_number(rs.getInt("account_number"));
				bean.setEmail(rs.getString("email"));
				bean.setDesignation(rs.getString("designation"));
				bean.setDob(rs.getDate("dob"));
				bean.setDept_id(rs.getInt("dept_id"));
				bean.setMngr_id(rs.getInt("mngr_id"));
				
			} // end of while
			return bean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			// 5.close all "JDBC Objects"
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
	@Override
	public boolean createemployee(EmployeeInfoBean emp) {
		// TODO Auto-generated method stub
		return false;
	}

}// end of class
