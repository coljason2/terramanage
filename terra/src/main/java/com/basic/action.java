package com.basic;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class action extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@RequestMapping(value = "/action")
	public String actiontest(ModelMap model, HttpServletRequest request) {
		model.addAttribute("message", "Hello Spring MVC Framework!");
		model.addAttribute("name", request.getParameter("name"));
		model.addAttribute("number", request.getParameter("number"));
		return "actiontest";
	}
}
