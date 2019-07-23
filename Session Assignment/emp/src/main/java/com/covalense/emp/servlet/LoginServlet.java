package com.covalense.emp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
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
       // ServletContext ctx=req.getServletContext();
		String idValue = req.getParameter("eid");
		String passwordValue = req.getParameter("password");
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		boolean login = false;

		
		  EmployeeInfoBean bean = dao.getEmployeeInfo(idValue);
		  //ctx.setAttribute("bean", bean);
		  req.setAttribute("bean", bean);
		 		if (passwordValue != null && bean != null && passwordValue.equals(bean.getPassword())) {

			// Valid Credentials; Create a session.
			HttpSession session = req.getSession(true);
			login = true;

		}

		PrintWriter out = resp.getWriter();
		RequestDispatcher dispatcher = null;
		dispatcher = req.getRequestDispatcher("home.html");
		dispatcher.include(req, resp);

		if (!login) {
			dispatcher = req.getRequestDispatcher("./login.jsp?msg=Employee not found");
			dispatcher.forward(req, resp);
		} else {
			
			dispatcher = req.getRequestDispatcher("./display.jsp?msg2=Employee Found ");
			dispatcher.forward(req, resp);
		}
	}

}
