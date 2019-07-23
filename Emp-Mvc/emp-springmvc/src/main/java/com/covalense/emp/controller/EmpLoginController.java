package com.covalense.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.covalense.emp.dto.EmployeeInfoBean;

@Controller
@RequestMapping("/forms")
public class EmpLoginController {

	@GetMapping("/getForm")
	public String getForm() {
		return "login";
	}
	@PostMapping("/formSubmit")
	public String formSubmit(EmployeeInfoBean employeeInfoBean , ModelMap modelMap) {
		modelMap.addAttribute("employeeInfoBean", employeeInfoBean);
		return "display";
}//End od login
	}
