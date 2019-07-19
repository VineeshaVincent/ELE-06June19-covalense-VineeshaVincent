package com.covalense.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/createCookie")
public class CreateCookieServlet extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		//create cookie
		Cookie myNameCookie=new Cookie("myname", "vini");
		Cookie myLocationCookie=new Cookie("myLocation", "bangalore");
		myLocationCookie.setMaxAge(7*24*60*60);//time in sec
		//send the above cookie to Browser
		resp.addCookie(myNameCookie);
		resp.addCookie(myLocationCookie);
		
		
		PrintWriter out=resp.getWriter();
		out.print("created the cookie!!!!!!!!!!!");
	}
}
