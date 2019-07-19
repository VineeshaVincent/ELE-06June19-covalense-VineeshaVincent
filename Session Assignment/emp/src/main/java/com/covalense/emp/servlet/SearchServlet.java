package com.covalense.emp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.covalense.emp.bean.EmployeeInfoBean;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;
@WebServlet("/search")
public class SearchServlet extends HttpServlet {

   
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		
		//validate the session
		HttpSession session=req.getSession(false);
		if(session==null) {
			out.println("<center><span style=\"color:red\">Invalid Session,Please login</span></center>");
			//Invalid session
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.html");
			dispatcher.include(req, resp);
		}else {
			//valid session
			EmployeeDAO dao=EmployeeDAOFactory.getInstance();
			//dao.getAllEmployeeInfo();
			ArrayList<EmployeeInfoBean> result=dao.getAllEmployeeInfo();
			
			if(result==null||result.size()==0) {
				
				out.println("<html");
				out.println("<body>");
				out.println("<center><span style=\"color:red\">no employee found</span></center>");

				out.println("</body>");
				out.println("</html");
			}else {
				out.println("<html");
				out.println("<body>");
				out.println("<h1><span style=\"color:red\">employee  found</span></h1>");
				out.println("<br>");
				out.println("Employee(s)found!!");
				for(EmployeeInfoBean employeeInfoBean:result) {
					out.print("<br><a href='./display?eid=" +employeeInfoBean .getId()+"'"+"/>ID:"
						+employeeInfoBean.getId());
					out.print("Name:"+employeeInfoBean.getName());
				}

				out.println("</body>");
				out.println("</html");
			}
		
		}
	}
	

	
}
