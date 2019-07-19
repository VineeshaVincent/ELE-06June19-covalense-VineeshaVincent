package com.covalense.emp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.emp.bean.EmployeeInfoBean;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;

@WebServlet("/createaccount")
public class CreateAccountServlet  extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
	SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd");

			String idValue=req.getParameter("emp_id");
			String nameValue=req.getParameter("emp_name");
			String ageValue=req.getParameter("emp_age");
			String genderValue=req.getParameter("emp_gender");
			String salaryValue=req.getParameter("emp_salary");
			String phoneValue=req.getParameter("emp_phone");
			String joining_dateValue=req.getParameter("emp_joining_date");
			String accountnumberValue=req.getParameter("emp_accountnumber");
			String designationValue=req.getParameter("emp_designation");
			String dobValue=req.getParameter("emp_dob");
			String department_idValue=req.getParameter("emp_department_id");
			String manager_idValue=req.getParameter("emp_manager_id");
			String passwordValue=req.getParameter("password");
			
			
			//Interact with db
			
			
			EmployeeInfoBean bean=new EmployeeInfoBean();
			
			 bean.setId(Integer.parseInt(idValue));
			 bean.setName(nameValue);
			 bean.setAge(Integer.parseInt(ageValue));
			 bean.setGender(genderValue);
			 bean.setSalary(Double.parseDouble(salaryValue));
			 bean.setPhone(Long.parseLong(phoneValue));
			 bean.setAccount_number(Integer.parseInt(accountnumberValue));
			 bean.setDesignation(designationValue);
			 bean.setDept_id(Integer.parseInt(department_idValue));
			 bean.setMngr_id(Integer.parseInt(manager_idValue));
			 bean.setPassword(passwordValue);
			 try {
				bean.setJoining_date(format.parse(joining_dateValue));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			 try {
				bean.setDob(format.parse(dobValue));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			//send the response to browser
			
			 EmployeeDAO dao=EmployeeDAOFactory.getInstance();
			 
				
			resp.setContentType("text/html");
			PrintWriter out=resp.getWriter();
			
			EmployeeInfoBean empinfo=(EmployeeInfoBean)req.getAttribute("Info");
			if(empinfo==null) {
				out.print("<HTML>");
				out.print("<BODY>");
				out.print("<H1><span style\"color:green\">Employee added!!!!</span></H1>");
				out.print("</HTML>");
				out.print("</BODY>");		
			}else {
				out.print("<HTML>");
				out.print("<BODY>");
				out.print("<H1><span style\"color:red\">Employee not added</span></H1>");
				out.print("<BR>");
				out.println("<br>id: "+empinfo.getId());
				out.println("<br>name: "+empinfo.getName());
				out.println("<br>email: "+empinfo.getEmail());
				out.println("<br>phone: "+empinfo.getPhone());
				out.println("<br>Age: "+empinfo.getAge());
				out.println("<br>Gender: "+empinfo.getGender());
				out.println("<br>Passsword: "+empinfo.getPassword());
				out.println("<br>salary: "+empinfo.getSalary());
				out.println("<br>Designation: "+empinfo.getDesignation());
				out.println("<br>Account_number: "+empinfo.getAccount_number());
				out.println("<br>Manager_id: "+empinfo.getMngr_id());
				out.println("<br>: Joining_Date"+empinfo.getJoining_date());
				out.print("</HTML>");
				out.print("</BODY>");	
			}
			

			
		}//End of doPost

	private Date SimpleDateFormat(int i) {
		return null;
	}

	
}
