package com.ssafy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/") //GET, POST 요청이든 
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public ModelAndView homeHandle1() {
		//데이터를 담을 바구니, View 정보를 저장할 객체
		ModelAndView mav = new ModelAndView();
		
		//데이터를 저장
		mav.addObject("msg", "Welcome Spring MVC(GET)");
		
		mav.setViewName("index");
		
		return mav;
	}
	
	@RequestMapping(value="/home", method=RequestMethod.POST)
	public ModelAndView homeHandle2() {
		//데이터를 담을 바구니, View 정보를 저장할 객체
		ModelAndView mav = new ModelAndView();
		
		//데이터를 저장
		mav.addObject("msg", "Welcome Spring MVC(POST)");
		
		mav.setViewName("index");
		
		return mav;
	}
	
	
	
}
