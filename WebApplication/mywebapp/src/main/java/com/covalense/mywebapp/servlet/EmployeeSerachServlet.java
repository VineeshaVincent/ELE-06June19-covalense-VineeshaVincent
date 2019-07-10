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
@WebServlet("/search")
public class EmployeeSerachServlet  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	

			String idValue=req.getParameter("emp_id");
			
			//Interact with db
			EmployeeDAO dao=EmployeeDAOFactory.getInstance();
			EmployeeInfoBean bean=dao.getEmployeeInfo(idValue);
			
			//send the response to browser
			
			PrintWriter out=resp.getWriter();
			
			if(bean==null) {
				out.print("<HTML>");
				out.print("<BODY>");
				out.print("<H1><span style\"color:red\">Employee Not Found!!!!</span></H1>");
				out.print("</HTML>");
				out.print("</BODY>");		
			}else {
				out.print("<HTML>");
				out.print("<BODY>");
				out.print("<H1><span style\"color:red\">Employee Found!!!!</span></H1>");
				out.print("<BR>");
				out.print("<BR>id is= " + bean.getId());
				out.print("<BR>name is= " + bean.getName());
				out.print("<BR>id Age= " + bean.getAge());
				out.print("<BR>gender is= " + bean.getGender());
				out.print("<BR>salary is= " + bean.getSalary());
				out.print("<BR>phone is= " + bean.getPhone());
				out.print("<BR>joining_date is= " + bean.getJoining_date());
				out.print("<BR>account numberis= " + bean.getAccount_number());
				out.print("<BR>designation is= " + bean.getDesignation());
				out.print("<BR>dob is= " + bean.getDob());
				out.print("<BR>department_id is= " + bean.getDept_id());
				out.print("<BR>manager_id is= " + bean.getMngr_id());
				out.print("</HTML>");
				out.print("</BODY>");
			}
		}//End of doGet
	}//End of class

