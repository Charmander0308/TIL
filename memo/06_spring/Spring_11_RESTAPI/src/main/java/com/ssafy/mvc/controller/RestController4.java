package com.ssafy.mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest4")
public class RestController4 {
	
//	http://localhost:8080/rest4/board/1
//	http://localhost:8080/rest4/board/2
//	http://localhost:8080/rest4/board/3
//	http://localhost:8080/rest4/board/99
	@GetMapping("/board/{boardid}")
	public String test1(@PathVariable("boardid") int boardid) {
		//서비스에서 id를 가지고 해당 게시글을 가져와서 반환
		return boardid + "번 게시글";	
	}
	
//	@GetMapping("/board/{boardid}")
//	public String test1(@PathVariable("boardid") String num) {
//		return num + "번 게시글";	
//	} -> 가능은 하지만 굳이 타입을 바꿀 이유는 없다!

	//충돌이 났어! 
	//{}안의 이름이 달라도 변수라는 점이 달라지진 않음!	
//	@GetMapping("/board/{reviewid}")
//	public String test2(@PathVariable("reviewid") int boardid) {
//		//서비스에서 id를 가지고 해당 게시글을 가져와서 반환
//		return boardid + "번 게시글";	
//	}
	
	
	
	
}
