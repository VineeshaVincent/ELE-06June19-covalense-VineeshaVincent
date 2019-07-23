package com.covalense.emp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.covalense.emp.dto.UserBean;

@Controller
@RequestMapping("/forms")
public class MyFormController {

	@GetMapping("/getForm")
	public String getForm() {
		return "myForm";
	}

	
	
	@PostMapping("/formSubmit")
	public String submitForm(HttpServletRequest req) {

		int userId = Integer.parseInt(req.getParameter("userId"));
		String pwd = req.getParameter("password");

		req.setAttribute("userId", userId);
		req.setAttribute("password", pwd);
		return "formDataDisplay";
	}// End Of formSubmit

	
	
	@PostMapping("/formSubmit2")
	public String submitForm2(int userId, String password, ModelMap modelMap) {
		modelMap.addAttribute("userId", userId);
		modelMap.addAttribute("password", password);

		return "formDataDisplay";
	}// End of formSubmit2

	
	
	@PostMapping("/formSubmit3")
	public String formSubmit3(UserBean userBean, ModelMap modelMap) {
		modelMap.addAttribute("userBean", userBean);
		return "formDataBeanDisplay";
	}// End of formSubmit3

	
	
	@PostMapping("/formSubmit4")
	public String formSubmit4(@RequestParam(name = "userId") int uid, @RequestParam(name = "password") String pwd,
			ModelMap modelMap) {
		modelMap.addAttribute("userId", uid);
		modelMap.addAttribute("password", pwd);
		return "formDataDisplay";

	}// End of formSubmit4
	
	
	@PostMapping("/formSubmit5")
	public String formSubmit5(@RequestParam(name = "userId") int uid,
			@RequestParam(name = "password") String pwd,
			ModelMap modelMap) {
		modelMap.addAttribute("userId", uid);
		modelMap.addAttribute("password", pwd);
		return "formDataDisplayEL";
	}// End of formSubmit5
	
	
	
	@PostMapping("/formSubmit6")
	public String formSubmit6(UserBean userBean, ModelMap modelMap) {
		modelMap.addAttribute("userBean", userBean);
		return "formDataBeanDisplayEL";
	}//End of formSubmit6
	
}// Enf of class
