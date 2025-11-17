package com.ssafy.mvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssafy.mvc.model.dto.Board;

import jakarta.servlet.http.HttpServletRequest;

@Controller
//@RequestMapping("/board")
public class BoardController {
	//서비스 호출 -> DAO -> DB 
	private final ArrayList<Board> list = new ArrayList<>();
	
//	public BoardController() {
//		this.list = new ArrayList<>();
//	}
	
	//등록페이지 주세요
	@GetMapping("/writeform")
	public String writeform() {
		return "board/writeform";
	}
	
	//등록요청 처리
//	@PostMapping("/write")
//	public String write(HttpServletRequest request) {
//		String title = request.getParameter("title");
//		String content = request.getParameter("content");
//		return null;
//	}
	
//	@PostMapping("/write")
//	public String write(@RequestParam("title")String title, @RequestParam("content")String content) {
//		Board board = new Board(title, content);
//		return null;
//	}
	
	@PostMapping("/write")
	public String write(@ModelAttribute Board board) {
		//등록하는 서비스메서드를 호출할거야!
		list.add(board);
		return "redirect:list";
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		//정석: 전체목록을 가져오는 서비스메서드 호출해서 바구니에 결가 넣기!
		model.addAttribute("boardList", list);
		return "/board/list"; //WEB-INT/board/list.jsp
	}
	
}
