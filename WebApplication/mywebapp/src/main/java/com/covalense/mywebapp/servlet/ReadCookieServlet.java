package com.covalense.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readCookie")
public class ReadCookieServlet extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) 
			throws ServletException, IOException {

		//get cookie from request
		Cookie[] receivedCookies=req.getCookies();
		
		PrintWriter out=resp.getWriter();
		
		if(receivedCookies==null) {
			out.print("Cookies are not present!!!!");
		}else {
			out.print("cookies are present!!!!!!!!!!!");
			
			for(Cookie rcvdcookie:receivedCookies) {
				
				out.print("Cookie name : "+rcvdcookie.getName());
				out.print("Cookie value :"+rcvdcookie.getValue());
			}//End of fo
		}//End of if-else

	}//End of doget()
}//End of class
