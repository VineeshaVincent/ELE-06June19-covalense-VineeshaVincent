package com.covalense.emp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogOutServlet extends HttpServlet {

       
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		//InValidate the session
		HttpSession session=req.getSession(false);
		if(session!=null) {
			session.invalidate();
		}
	PrintWriter out=resp.getWriter();
	out.print("<HTML>");
	out.print("<BODY>");
	out.print("<H1><span style\"color:blue\">Thanks for visiting our page!!!!!!</span></H1>");
	out.print("</HTML>");
	out.print("</BODY>");	
	RequestDispatcher dispatcher=req.getRequestDispatcher("./Login.html");
	dispatcher.include(req, resp);
	}//End of doGet()

}//End of Class
