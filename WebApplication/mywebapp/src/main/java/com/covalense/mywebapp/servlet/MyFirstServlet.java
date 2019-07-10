package com.covalense.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet  extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String currentDateTime=new Date().toString();
		
		//Get Query String Information
		String fnameValue=req.getParameter("fname");
		String lnameValue=req.getParameter("lname");
		
		
		String htmlResponse="<!DOCTYPE html>"+
				"<html>"+
				"<head>"+
				"<meta charset=\"ISO-8859-1\">"+
				"<title>Insert title here</title>"+
				"</head>"+
				"<body>"+
				"<h1>Current Date and Time is:<span style=\"color:green;\">"+currentDateTime+"</span>"+
				"			<BR><BR>"+
				"				First Name="	+fnameValue+
				"			<BR><BR>"+
				"			Last Name="	+lnameValue+
				"</h1>"+
				"</body>"+
				"</html>";
		//Send the above html response to the browser
		resp.setContentType("html/text");
		//resp.setHeader("Refresh", "1");//
		PrintWriter out=resp.getWriter();
		out.print(htmlResponse);
	}//end of doget()
}//End of class
