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

import com.covalense.emp.bean.EmployeeInfoBean;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		String idValue=req.getParameter("eid");
		String passwordValue=req.getParameter("password");
		EmployeeDAO dao=EmployeeDAOFactory.getInstance();
		boolean login=false;
		
		EmployeeInfoBean bean=dao.getEmployeeInfo(idValue);
		
		if(passwordValue!= null && bean!= null && passwordValue.equals(bean.getPassword())) {
			
			//Valid Credentials; Create a session.
			HttpSession session=req.getSession(true);
			login=true;
		}
		
		PrintWriter out=resp.getWriter();
		RequestDispatcher dispatcher=null;
		dispatcher=req.getRequestDispatcher("home.html");
		dispatcher.include(req, resp);
		
		if(!login) {
			/*
			 * out.println("<html"); out.println("<body>");
			 * out.println("<h1><span style=\"color:red\">employee not found</span>");
			 * out.println("</h1>"); out.println("</body>"); out.println("</html");
			 */
			out.println("<html");
			out.println("<body>");
			out.println("<center><span style=\"color:red\">employee not found/password is incorrect</span></center>");

			out.println("</body>");
			out.println("</html");
			
			String url="Login.html";
			
			dispatcher=req.getRequestDispatcher(url);
			dispatcher.include(req, resp);
		}else {
			out.println("<html");
			out.println("<body>");
			out.println("<h1><span style=\"color:red\">employee  found</span></h1>");
			out.println("<br>");
			out.println("<br>id: "+bean.getId());
			out.println("<br>name: "+bean.getName());
			out.println("<br>age: "+bean.getAge());
			out.println("<br>email: "+bean.getEmail());
			out.println("<br>phone: "+bean.getPhone());
			out.println("<br>dob: "+bean.getDob());
			out.println("<br>salary: "+bean.getSalary());
			out.println("<br>Password: "+bean.getPassword());
			out.println("<br>Designation: "+bean.getDesignation());
			out.println("<br>dob: "+bean.getDob());
			out.println("<br>Dept_id: "+bean.getDept_id());
			out.println("<br>Mngr_id: "+bean.getMngr_id());
			out.println("<br>Account_number: "+bean.getAccount_number());
			out.println("</body>");
			out.println("</html");
	}		
	}

}
