package com.covalense.mywebapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.bean.EmployeeInfoBean;

@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req,
		HttpServletResponse resp)
		throws ServletException, IOException {
	
	
	EmployeeInfoBean empinfo=new EmployeeInfoBean();
	empinfo.setId(1234);
	empinfo.setName("riyan");
	empinfo.setEmail("riyan@gmail.com");
	empinfo.setPhone(2341234);
	
	//Pass the Atribute
	
	
	//req.setAttribute("Info", empinfo);
	ServletContext ctx=getServletContext();
	ctx.setAttribute("Info", empinfo);
	
	String url="search?emp_id=2";
	//String url="http://www.gmail.com";
	
	
	RequestDispatcher dispatcher=req.getRequestDispatcher(url);
	dispatcher.forward(req, resp);


}
}
