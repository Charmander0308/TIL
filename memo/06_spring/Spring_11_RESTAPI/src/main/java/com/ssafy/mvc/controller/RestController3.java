package com.ssafy.mvc.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest3")
public class RestController3 {
	
//	http://localhost:8080/rest3/test
	@GetMapping("/test")
	public String test1() {
		return "GET";	
	}
	
//	http://localhost:8080/rest3/test
	@PostMapping("/test")
	public String test2() {
		return "POST";	
	}
	
//	http://localhost:8080/rest3/test
	@PutMapping("/test")
	public String test3() {
		return "PUT";	
	}
	
//	http://localhost:8080/rest3/test
	@DeleteMapping("/test")
	public String test4() {
		return "DELETE";	
	}
	
}
