package com.ssafy.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssafy.mvc.model.dto.User;
import com.ssafy.mvc.model.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
	
	@Autowired
	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	//회원가입 페이지 주세요~~
	@GetMapping("/signup")
	public String signupForm() {
		return "/user/signupform";
	}
	
	//회원가입 해줘잉
	@PostMapping("/signup")
	public String signup(@ModelAttribute User user) {
		userService.signup(user);
		//회원가입 1. 메인페이지 / 2. 로그인페이지
		//회원가입 성공 시 바로 로그인 했다 처리하고 메인페이지로
		return "redirect:login";
	}
	
	//로그인 페이지 주세요
	@GetMapping("/login")
	public String loginForm() {
		return "/user/loginform";
	}
	
	//로그인 해줘잉
	@PostMapping("/login")
	public String login(@RequestParam("id") String id, @RequestParam("password") String pw, HttpSession session) {
		User loginUser = userService.login(id, pw);
		if(loginUser == null) {
			//로그인 실패 -> 로그인 페이지에 머물러 있어라
			System.out.println("그런 사람 없어요~");
			return "redirect:login";
		}
//		session.setAttribute("id", loginUser.getId());
		session.setAttribute("loginUser", loginUser.getName());
		return "redirect:list";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:login";
	}
	
	@GetMapping("/users")
	public String userList(Model model) {
		model.addAttribute("userList", userService.getUserList());
		return "/user/adminPage";
	}
}
