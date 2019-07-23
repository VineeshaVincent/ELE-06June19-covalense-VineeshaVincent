package com.covalense.emp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.emp.bean.EmployeeInfoBean;
import com.covalense.emp.bean.EmployeeOtherInfoBean;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;

@WebServlet("/createaccount")
public class CreateAccountServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");

		String idValue = req.getParameter("emp_id");
		String nameValue = req.getParameter("emp_name");
		String ageValue = req.getParameter("emp_age");
		String genderValue = req.getParameter("emp_gender");
		String emailValue = req.getParameter("email");
		String salaryValue = req.getParameter("emp_salary");
		String phoneValue = req.getParameter("emp_phone");
		String joining_dateValue = req.getParameter("emp_joining_date");
		String accountnumberValue = req.getParameter("emp_accountnumber");
		String designationValue = req.getParameter("emp_designation");
		String dobValue = req.getParameter("emp_dob");
		String department_idValue = req.getParameter("emp_department_id");
		String manager_idValue = req.getParameter("emp_manager_id");
		String passwordValue = req.getParameter("password");
		

		// Interact with db

		EmployeeInfoBean bean = new EmployeeInfoBean();

		bean.setId(Integer.parseInt(idValue));
		bean.setName(nameValue);
		bean.setAge(Integer.parseInt(ageValue));
		bean.setGender(genderValue);
		bean.setEmail( emailValue);
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
		EmployeeOtherInfoBean otherInfoBean=new EmployeeOtherInfoBean();
		
		String idValue1 = req.getParameter("emp_id");
		String panValue=req.getParameter("pan_no");
		String ismarriedValue=req.getParameter("ismarried");
		String bloodValue=req.getParameter(" blood_grp");
		String ischallengedValue=req.getParameter("ischallenged");
		String econtactnoValue=req.getParameter("emergency_contact_number");
		String econtactpersonpanValue=req.getParameter("emergency_contact_person");
		String nationalityValue=req.getParameter("nationality");
		String religionValue=req.getParameter("religion");
		String fathrnmeValue=req.getParameter("father_nm");
		String mothrnmeValue=req.getParameter("mother_nm");
		String spousenmeValue=req.getParameter("spouse_nm");
		String passportValue=req.getParameter("passport");
		String adarValue=req.getParameter("adhar");
		
		otherInfoBean.setId(Integer.parseInt(idValue1));
		otherInfoBean.setPan_no(panValue);
		
		if(ismarriedValue!=null && ismarriedValue.equals("Married")) {
			otherInfoBean.setIsmarried(true);	
		} else {
			otherInfoBean.setIsmarried(false);
		}
		
		otherInfoBean.setBlood_grp(bloodValue);
		if(ischallengedValue!=null && ischallengedValue.equals("Yes")) {
			otherInfoBean.setIschallenged(true);
		} else {
			otherInfoBean.setIschallenged(false);
		}
		otherInfoBean.setEmergency_contact_number(Integer.parseInt(econtactnoValue));
		otherInfoBean.setEmergency_contact_person(econtactpersonpanValue);
		otherInfoBean.setNationality(nationalityValue);
		otherInfoBean.setReligion(religionValue);
		otherInfoBean.setFather_nm(fathrnmeValue);
		otherInfoBean.setMother_nm(mothrnmeValue);
		otherInfoBean.setSpouse_nm(spousenmeValue);
		otherInfoBean.setPassport(passportValue);
		otherInfoBean.setAdhar(Integer.parseInt(adarValue));
		
		
		// send the response to browser

		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		/*
		 * dao.createemployee(bean);
		 * 
		 * resp.setContentType("text/html"); PrintWriter out = resp.getWriter();
		 * 
		 * EmployeeInfoBean empinfo = (EmployeeInfoBean) req.getAttribute("Info");
		 */
		bean.setOtherInfo(otherInfoBean);
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		RequestDispatcher dispatcher = null;
		if (dao.createemployee(bean)) {
			//req.setAttribute("bean", bean);
			dispatcher = req.getRequestDispatcher("./display.jsp?msg2=created employee.... ");
			dispatcher.forward(req, resp);
		} else {
			dispatcher = req.getRequestDispatcher("./login.jsp?msg=could not create employee...");
			dispatcher.forward(req, resp);
		}

	}// End of doPost


}
