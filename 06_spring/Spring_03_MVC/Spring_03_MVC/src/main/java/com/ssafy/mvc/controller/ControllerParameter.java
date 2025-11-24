package com.ssafy.mvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ControllerParameter {

	@GetMapping("/test1")
	public String test1() {
		// String 반환 -> View 이름이라고 생각을 하겠다.
		return "test1"; // WEB-INF/view/test1.jsp
	}

	@GetMapping("/test2-1")
	public String test2_1(Model model) {
		// model 이라는 바구니를 파라미터로 준비
		model.addAttribute("msg", "model data");
		return "test2"; // WEB-INF/view/test2.jsp
	}

	@GetMapping("/test2-2")
	public String test2_2(Map<String, Object> map) {
		// model 이라는 바구니를 파라미터로 준비
		map.put("msg", "map data");
		return "test2"; // WEB-INF/view/test2.jsp
	}

	// 파라미터 처리를 하고 싶다.
	@GetMapping("/test3-1")
	public String test3_1(Model model, HttpServletRequest request) {
		String id = request.getParameter("id");

		model.addAttribute("id", id);

		return "test3"; // WEB-INF/view/test3.jsp
	}

	@GetMapping("/test3-2")
	public String test3_2(Model model, @RequestParam("myid") String id,
			@RequestParam(value = "pw", defaultValue = "0000") String pw) {

		model.addAttribute("id", id);
		return "test3"; // WEB-INF/view/test3.jsp
	}

}
