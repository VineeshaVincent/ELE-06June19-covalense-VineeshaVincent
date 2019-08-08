package com.covalense.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;
import com.covalense.emp.dto.EmployeeInfoBean;

import static com.covalense.emp.commons.EMPConstants.*;

@Controller
@RequestMapping("/login")
@PropertySource(PROPERTY_FILE)
public class LoginController {
	
	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;

	@GetMapping("/loginPage")
	public String loginPage() {
		return VIEW_LOGIN_PAGE;
	}// End of loginPage
	
	@PostMapping("/authenticate")
	public String authenticate(String userId,String password ,HttpServletRequest req ,
			@Value("${msg}") String msg , @Value("${msg2}") String msg2,
			@Value("${dbInteractionType}") String dbInteractionType ) {
		
		
		//EmployeeDAO dao = EmployeeDAOFactory.getInstance(dbInteractionType);
		EmployeeInfoBean bean = dao.getEmployeeInfo(userId);
		
		if(password.equals(bean.getPassword())) {
			HttpSession session=req.getSession(true);
			session.setAttribute("employeeInfoBean", bean);
			req.setAttribute("msg2", msg2);
		return VIEW_HOME_PAGE;
		}
		req.setAttribute("msg", msg);
		return VIEW_LOGIN_PAGE;
		
	}//End of authenticate()
	@GetMapping("/logout")
	public String logout(HttpSession session,ModelMap modelMap,@Value("${logoutmsg}") String msg ) {
		session.invalidate();
		modelMap.addAttribute("msg",msg);
		return  VIEW_LOGIN_PAGE;
	}
}
