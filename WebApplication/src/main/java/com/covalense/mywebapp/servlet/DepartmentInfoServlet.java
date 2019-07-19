package com.covalense.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.bean.EmployeeInfoBean;
import com.covalense.mywebapp.dao.EmployeeDAO;
import com.covalense.mywebapp.dao.EmployeeDAOFactory;

import lombok.extern.java.Log;
@Log
@WebServlet("/dept")
public class DepartmentInfoServlet extends HttpServlet {
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String idValue=req.getParameter("dept_Id");
	String nameValue=req.getParameter("dept_name");
	
	EmployeeInfoBean bean=new EmployeeInfoBean();
	
	 bean.setId(Integer.parseInt(idValue));
	 bean.setName(nameValue);
	 EmployeeDAO dao=EmployeeDAOFactory.getInstance();
	 
		
	 resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	
	if(dao.createemployee(bean)) {
		out.print("<HTML>");
		out.print("<BODY>");
		out.print("<H1><span style\"color:green\">Department Created!!!!</span></H1>");
		out.print("</HTML>");
		out.print("</BODY>");	
	}
	
}
}
