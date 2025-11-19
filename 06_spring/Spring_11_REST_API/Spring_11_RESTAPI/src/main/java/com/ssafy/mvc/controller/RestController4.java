package com.ssafy.mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest4")
public class RestController4 {

	//http://localhost:8080/rest4/board/1
	//http://localhost:8080/rest4/board/2
	//http://localhost:8080/rest4/board/3
	//http://localhost:8080/rest4/board/99
//	@GetMapping("/board/{boardid}")
//	public String test1(@PathVariable int boardid) {
//		//서비스에서 id를 가지고 해당 게시글을 가져와서 반환
//		return boardid + "번 게시글"; 
//	}
	@GetMapping("/board/{boardid}")
	public String test1(@PathVariable("boardid") String num) {
		//서비스에서 id를 가지고 해당 게시글을 가져와서 반환
		return num + "번 게시글"; 
	}
	
	//충돌이 났어!
//	@GetMapping("/board/{reviewid}")
//	public String test2(@PathVariable("reviewid") String num) {
//		//서비스에서 id를 가지고 해당 게시글을 가져와서 반환
//		return num + "번 리뷰"; 
//	}
	
	
	
	
	
	
	
	
}
