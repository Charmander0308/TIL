package com.ssafy.mvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssafy.mvc.model.dto.UserDto;

@Controller
public class RestController1 {
	
//	http://localhost:8080/rest1/test1 으로 요청을 보냄 -> DispatcherServlet에 의해 이 메서드가 호출
	@GetMapping("/rest1/test1")
	public String test1() {
		return "hello";	//hello 라고 하는 이름의 뷰가 있는지 찾을거야!
	}
	
//	http://localhost:8080/rest1/test2
	@GetMapping("/rest1/test2")
	@ResponseBody
	public String test2() {
		return "hello";	
	}
	
//	http://localhost:8080/rest1/test3
	@GetMapping("/rest1/test3")
	@ResponseBody
	public Map<String, String> test3() {
		Map<String, String> data = new HashMap<>();
		data.put("id", "ssafy");
		data.put("pw", "1234");
		return data;	
	}
	
//	http://localhost:8080/rest1/test4
	@GetMapping("/rest1/test4")
	@ResponseBody
	public UserDto test4() {
		//MyPage를 눌러서 유저의 정보를 반환해야하는 상황을 가정
		//들어온 ID를 이용하여 서비스 호출 -> DAO 호출 -> DB 찍고 다시 정보를 주겠다.
		UserDto user = new UserDto("ssafy", "1234", "김싸피");
		return user;
	}
	
//	http://localhost:8080/rest1/test5
	@GetMapping("/rest1/test5")
	@ResponseBody
	public List<UserDto> test5() {
		//유저 전체 목록을 불러오는 상황을 가정
		List<UserDto> list = new ArrayList<>();
		list.add(new UserDto("ssafy1", "12341", "김싸피"));
		list.add(new UserDto("ssafy2", "12342", "권싸피"));
		list.add(new UserDto("ssafy3", "12343", "박싸피"));
		list.add(new UserDto("ssafy4", "12344", "이싸피"));
		list.add(new UserDto("ssafy5", "12345", "제갈싸피"));
		return list;
	}
	
}
