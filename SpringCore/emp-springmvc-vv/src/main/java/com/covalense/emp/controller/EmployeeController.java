package com.covalense.emp.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dto.EmployeeInfoBean;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	/*
	 * @Autowired
	 * 
	 * @Qualifier(DB_INTERACTION_TYPE) EmployeeDAO dao;
	 * 
	 * 
	 * @InitBinder public void customBinder(WebDataBinder binder) { CustomDateEditor
	 * customDateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),
	 * true); binder.registerCustomEditor(Date.class, customDateEditor); }
	 * 
	 * @GetMapping("/search") public String employeeSreach(String userId,String
	 * password ,HttpServletRequest req) { ArrayList<EmployeeInfoBean>
	 * beans=dao.getAllEmployeeInfo(userId); req.setAttribute("beanlist", beans);
	 * return VIEW_SEARCH_RESULT_PAGE; }
	 */
	
	@GetMapping("/addEmployee")
	public String createaccount(HttpSession session,ModelMap modelMap) {
		if(session.isNew()) {
			modelMap.addAttribute("msg","Please login first");
			return "login";
		}
		return "addEmployee";
	}
}

