package com.covalense.mywebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.bean.EmployeeInfoBean;
import com.covalense.mywebapp.dao.EmployeeDAO;
import com.covalense.mywebapp.dao.EmployeeDAOFactory;


@WebServlet(urlPatterns="/search",
initParams= {
		@WebInitParam(name="actress",value="sreedevi")

})
//@WebServlet("/search/employeeSearch")
public class EmployeeSerachServlet  extends HttpServlet{

	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
				throws ServletException, IOException {	
		
	ServletContext ctx=getServletContext();
	String movieName=ctx.getInitParameter("movie");
	
	ServletConfig config=getServletConfig();
	String actorName=config.getInitParameter("actor");
	String actressName=config.getInitParameter("actress");
	
	
	String idValue=req.getParameter("emp_id");
	
	EmployeeDAO dao=EmployeeDAOFactory.getInstance();
	EmployeeInfoBean bean=dao.getEmployeeInfo(idValue);
	
	PrintWriter out=resp.getWriter();
	
	if(bean==null) {
		out.println("<html");
		out.println("<body>");
		out.println("<h1><span style=\"color:red\">employee not found</span>");
		out.println("</h1>");
		out.println("</body>");
		out.println("</html");
	}else {
		out.println("<html");
		out.println("<body>");
		out.println("<h1><span style=\"color:red\">employee  found</span>");
		out.println("<br>");
		out.println("<br>id"+bean.getId());
		out.println("<br>name"+bean.getName());
		out.println("<br>age"+bean.getAge());
		out.println("<br>email"+bean.getEmail());
		out.println("<br>phone"+bean.getPhone());
		out.println("<br>dob"+bean.getDob());
		out.println("<br>salary"+bean.getSalary());
		out.println("<br>movieName"+movieName);
		out.println("<br>actorName"+actorName);
		out.println("<br>actressName"+actressName);
		out.println("</body>");
		out.println("</html");
}
	//Get the object from forward servlet
	//EmployeeInfoBean empinfo=(EmployeeInfoBean)req.getAttribute("Info");
	EmployeeInfoBean empinfo=(EmployeeInfoBean)ctx.getAttribute("Info");
	if(empinfo==null) {
		out.println("<html");
		out.println("<body>");
		out.println("<h1><span style=\"color:red\">employeeinfo object  not found</span>");
		out.println("</h1>");
		out.println("</body>");
		out.println("</html");
	}else {
		out.println("<html");
		out.println("<body>");
		out.println("<h1><span style=\"color:red\">employeeinfo object  found</span>");
		out.println("<br>");
		out.println("<br>id: "+empinfo.getId());
		out.println("<br>name: "+empinfo.getName());
		out.println("<br>email: "+empinfo.getEmail());
		out.println("<br>phone: "+empinfo.getPhone());
		out.println("</body>");
		out.println("</html");
}
	
	
	
	
}//End of Doget
}//End of class

