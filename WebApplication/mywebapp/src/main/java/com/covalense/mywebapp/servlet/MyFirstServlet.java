package com.covalense.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.java.Log;
@Log
public class MyFirstServlet  extends HttpServlet{
	
	@Override
	protected  void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		ServletContext ctx=getServletContext();
		String movieName=ctx.getInitParameter("movie");
		
		ServletConfig config=getServletConfig();
		String actorName=config.getInitParameter("actor");
		
		String currentDateTime=new Date().toString();
		
//		System.out.println("inside Doget() method!!!!!!!!!!!!!!");
//		String httpMethod=req.getMethod();
//		String protocol=req.getProtocol();
//		String requestUrl=req.getRequestURI().toString();
//		
//		
//		log.info("HTTP METHOD======>"+httpMethod);
//		log.info("PROTOCOL======>"+protocol);
//		log.info("REQUEST URL======>"+requestUrl);
				
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
				"			<BR><BR>"+
				"			Movie Name="	+movieName+
				"			<BR><BR>"+
				"		Actor Name="	+actorName+
				"</h1>"+
				"</body>"+
				"</html>";
		//Send the above html response to the browser
		resp.setContentType("text/html");
		//resp.setHeader("Refresh", "1");//
		PrintWriter out=resp.getWriter();
		out.print(htmlResponse);
	}//end of doget()
}//End of class
