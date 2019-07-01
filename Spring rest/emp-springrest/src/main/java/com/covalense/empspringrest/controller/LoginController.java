package com.covalense.empspringrest.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.empspringrest.dao.EmployeeDAO;
import com.covalense.empspringrest.dto.EmployeeInfoBean;
import com.covalense.empspringrest.dto.EmployeeResponse;

import static com.covalense.empspringrest.commons.EMPConstants.*;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController

  @RequestMapping("/login")
  
  //@PropertySource(PROPERTY_FILE)
 
public class LoginController {
	
	@Autowired
	@Qualifier(DB_INTERACTION_TYPE)
	private EmployeeDAO dao;

	/*
	 * @GetMapping("/loginPage") public String loginPage() { return VIEW_LOGIN_PAGE;
	 * }// End of loginPage
	 */	
	@PostMapping(value="/auth",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse login(int id,String password,HttpServletRequest request) {
		EmployeeInfoBean bean=dao.getEmployeeInfo(id);
		EmployeeResponse response=new EmployeeResponse();
		if(bean!=null&&bean.getPassword().equals(password)) {
			response.setStatusCode(201);
			response.setMessage("Success!!!!");
			response.setDescription("Logged In Successfully");
			response.setInfoBeans(Arrays.asList(bean));
			request.getSession().setAttribute("bean", bean);
		}else {
			response.setStatusCode(202);
			response.setMessage("Failure!!!!");
			response.setDescription("Invalid credentials");
		}
		return response;
	}
	@GetMapping(value = "/logout",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse logout(HttpSession session) {
		session.invalidate();
		EmployeeResponse response=new EmployeeResponse();
		response.setStatusCode(301);
		response.setMessage("Success!!!!");
		response.setDescription("Logged Out Successfully");
		return response;
	}
	@GetMapping(value = "/readCookie",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse readCookie(@CookieValue(name = "JSESSIONID")String sessionId) {
		EmployeeResponse response=new EmployeeResponse();
		response.setStatusCode(301);
		response.setMessage("Success!!!!");
		response.setDescription("JSESSIONID: "+ sessionId);
		return response;
	}
	
	/*
	 * @PostMapping("/authenticate") public String authenticate(String userId,String
	 * password ,HttpServletRequest req ,
	 * 
	 * @Value("${msg}") String msg , @Value("${msg2}") String msg2,
	 * 
	 * @Value("${dbInteractionType}") String dbInteractionType ) {
	 * 
	 * 
	 * //EmployeeDAO dao = EmployeeDAOFactory.getInstance(dbInteractionType);
	 * EmployeeInfoBean bean = dao.getEmployeeInfo(userId);
	 * 
	 * if(password.equals(bean.getPassword())) { HttpSession
	 * session=req.getSession(true); session.setAttribute("employeeInfoBean", bean);
	 * req.setAttribute("msg2", msg2); return VIEW_HOME_PAGE; }
	 * req.setAttribute("msg", msg); return VIEW_LOGIN_PAGE;
	 * 
	 * }//End of authenticate()
	 * 
	 * @GetMapping("/logout") public String logout(HttpSession session,ModelMap
	 * modelMap,@Value("${logoutmsg}") String msg ) { session.invalidate();
	 * modelMap.addAttribute("msg",msg); return VIEW_LOGIN_PAGE; }
	 */
}
