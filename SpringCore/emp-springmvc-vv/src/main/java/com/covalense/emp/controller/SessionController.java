package com.covalense.emp.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactoryOld;
import com.covalense.emp.dto.EmployeeInfoBean;
import com.covalense.emp.dto.UserBean;

import lombok.extern.java.Log;


@Controller
@RequestMapping("/session")

@Log
public class SessionController {

	@GetMapping("/login")
	public String login() {
		return "login";
		
	}//End of login()
	
	
	@PostMapping("/login")
	public String authenticate(UserBean userBean ,HttpServletRequest req) {
		EmployeeDAO dao = EmployeeDAOFactoryOld.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(userBean.getUserId());
		if(userBean.getPassword().equals(bean.getPassword())) {
			HttpSession session=req.getSession(true);
			req.setAttribute("employeeInfoBean", bean);
		return "display";
		}
		req.setAttribute("msg", "Invalid Credentials");
		return "login";
		
	}//End of authenticate()
	@PostMapping("/logout")
	public String logout(HttpSession session,ModelMap modelMap) {
		session.invalidate();
		modelMap.addAttribute("msg","Logout successfully");
		return "login";
	}
	@GetMapping("/login1")
	public String createaccount(HttpSession session,ModelMap modelMap) {
		if(session.isNew()) {
			modelMap.addAttribute("msg","Please login first");
			return "login";
		};
		return "addEmployee";
	}
	@GetMapping("/search")
	public String search(ModelMap modelMap,@RequestParam int id,
			@SessionAttribute(name="userBean",required=false) UserBean userBean) {
		if(userBean !=null) {
			log.info(userBean.toString());
		}
		modelMap.addAttribute("id",id);
		return "search";
	}
	
	@GetMapping("/validate")
	public String validateSession(HttpSession session,ModelMap modelMap,@RequestParam("url") String url,@Value("${msg}") String msg) {
		System.out.println(url);
		if(session.isNew()) {
			modelMap.addAttribute("msg", msg);
			session.invalidate();
			return "login";
		}
		return "forward:/session/"+url;
		
	}
	@GetMapping("/validate3/{url}")
	public String validateSession3(HttpSession session,ModelMap modelMap,
			@Value("${msg}") String msg,@PathVariable("url") String url ) {
		if(session.isNew()) {
			modelMap.addAttribute("msg", msg);
			session.invalidate();
			return "login";
		}
		return "forward:/session/"+url;
		
	}
	@GetMapping("/validate2")
	public String validateSession2(HttpServletRequest req,ModelMap modelMap,@RequestParam("url") String url) {
		if(req.getSession(false)==null) {
			modelMap.addAttribute("msg", "Please login");
			return "login";
		}
		return url;
	}
	@PostMapping("/validate")
	public String validateSession4post(HttpSession session,ModelMap modelMap,@RequestParam String url ,@Value("${msg}") String msg) {
		return validateSession(session, modelMap, url,msg);
	}//End of validateasession
	
	
}//End of SessionController
