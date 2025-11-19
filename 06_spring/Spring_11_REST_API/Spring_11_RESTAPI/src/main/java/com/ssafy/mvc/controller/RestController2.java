package com.ssafy.mvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.mvc.model.dto.UserDto;

@RestController
@RequestMapping("/rest2")
public class RestController2 {

	//http://localhost:8080/rest2/test1
	@GetMapping("/test1")
	public String test1() {
		return "hello"; 
	}
	
	//http://localhost:8080/rest2/test2
	@GetMapping("/test2")
	public String test2() {
		return "hello"; 
	}
	
	
	//http://localhost:8080/rest2/test3
	@GetMapping("/test3")
	public Map<String, String> test3() {
		Map<String, String> data = new HashMap<>();
		data.put("id", "ssafy");
		data.put("pw", "1234");
		return data; 
	}
	
	//http://localhost:8080/rest2/test4
	@GetMapping("/test4")
	public UserDto test4() {
		//MyPage를 눌러서 유저의 정보를 반환해야하는 상황을 가정
		//들어온 ID를 이용하여 서비스 호출 -> DAO 호출 -> DB 다시정보를 주겠다.
		UserDto user = new UserDto("ssafy", "1234", "김싸피");
		return user; 
	}
	
	//http://localhost:8080/rest2/test5
	@GetMapping("/test5")
	public List<UserDto> test5() {
		//유저 전체 목록을 불러오는 상황을 가정
		List<UserDto> list = new ArrayList<>();
		list.add(new UserDto("ssafy1", "12341", "김싸피"));
		list.add(new UserDto("ssafy2", "12342", "손싸피"));
		list.add(new UserDto("ssafy3", "12343", "유싸피"));
		list.add(new UserDto("ssafy4", "12344", "권싸피"));
		list.add(new UserDto("ssafy5", "12345", "양싸피"));
		return list; 
	}
	
	
	
	
	
	
	
	
}
