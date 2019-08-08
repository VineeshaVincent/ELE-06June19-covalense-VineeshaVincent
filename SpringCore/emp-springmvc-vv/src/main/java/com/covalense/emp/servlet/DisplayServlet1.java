package com.covalense.emp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactoryOld;
import com.covalense.emp.dto.EmployeeInfoBean;



@WebServlet("/display")
public class DisplayServlet1 extends HttpServlet {
	
	private EmployeeInfoBean searchEmployee(String id){
		
		EmployeeDAO dao=EmployeeDAOFactoryOld.getInstance();
		EmployeeInfoBean bean=dao.getEmployeeInfo(id);
		return bean;
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		String idValue=req.getParameter("eid");
		
		EmployeeInfoBean bean=searchEmployee(idValue);
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		if(bean==null) {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><span style\"color:green\">Unable to retrieve from servlet</span></H1>");
			out.print("</HTML>");
			out.print("</BODY>");	
			
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.html");
			dispatcher.include(req, resp);
		}else {
			out.println("<html");
			out.println("<body>");
			out.println("<h1><span style=\"color:red\">Retrived from the servlet</span></h1>");
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
