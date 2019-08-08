package com.covalense.emp.controller;

import static com.covalense.emp.commons.EMPConstants.*;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/validator")
@PropertySource(PROPERTY_FILE)
public class SessionValidateController {

	@GetMapping("/validate/{url1}/{url2}")
	public String validate(HttpSession session,ModelMap modelMap,@Value("${validate}") String msg,
			@PathVariable("url1") String url1,
			@PathVariable("url2") String url2) {
	if(session.isNew()) {
		modelMap.addAttribute("validate", msg);
		return VIEW_LOGIN_PAGE;
	}
	return "forward:"+url1+"/"+url2;

}// End of validate

@PostMapping("/validate")
public String validationPost(HttpSession session,ModelMap modelMap,
		@Value("${validate}") String validate,
		@PathVariable("url1") String url1,
		@PathVariable("url2") String url2) {
	return validate(session,modelMap,validate,url1,url2);
}
}
