package com.ssafy.mvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.mvc.model.dto.UserDto;


@RestController
@RequestMapping("/rest5")
public class RestController5 {
	
//	http://localhost:8080/rest5/board
//	@PostMapping("/user1")
//	public String test1(@ModelAttribute UserDto user) {
//		//입력받은 데이터를 이용해서 서비스를 호출해서 등록
//		return user.toString();
//	}
	//user 자체를 반환하고싶으면 (jackson에 의해 json으로 변환)
	@PostMapping("/user1")
	public UserDto test1(@ModelAttribute UserDto user) {
		//입력받은 데이터를 이용해서 서비스를 호출해서 등록
		return user;
	}
	
	@PostMapping("/user2")
	public UserDto test2(@RequestBody UserDto user) {
		//입력받은 데이터를 이용해서 서비스를 호출해서 등록
		return user;
	}
	
	@PostMapping("/user3")
	public ResponseEntity<UserDto> test3(@RequestBody UserDto user){
		return new ResponseEntity<>(user, HttpStatus.CREATED);
	}
	
}
