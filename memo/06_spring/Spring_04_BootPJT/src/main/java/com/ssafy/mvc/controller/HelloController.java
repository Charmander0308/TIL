package com.ssafy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("msg", "Hello Spring Boot");
		
		return "hello";	//view name -> /WEB-INF/views/hello.jsp
	}
	
	
}
