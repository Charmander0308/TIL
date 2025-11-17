package com.ssafy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssafy.mvc.model.dto.Board;
import com.ssafy.mvc.model.service.BoardService;

@Controller
public class BoardController {
	
	private final BoardService boardService;
	
//	@Autowired
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}
	
	//등록페이지 주세요
	@GetMapping("/writeform")
	public String writeform() {
		return "/board/writeform";
	}
	
	
	//등록 해줘잉
	@PostMapping("/write")
	public String write(@ModelAttribute Board board) {
		//서비스 호출
		boardService.writeBoard(board);
		//전체 목록을 보여주도록 해줘잉
		return "redirect:list";
	}
	
	//목록 보여줘
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("boardList", boardService.getBoardList());
		return "/board/list";
	}
	
	//상세게시글 보여줘
	@GetMapping("/detail")
	public String detail(@RequestParam("id") int id, Model model) {
		model.addAttribute("board", boardService.readBoard(id));
		return "/board/detail";
	}
	/////////////////////////////////////////
	@GetMapping("/delete")
	public String delete(@RequestParam("id") int id) {
		boardService.removeBoard(id);
		return "redirect:list";
	}

	@GetMapping("/updateform")
	public String updateForm(@RequestParam("id") int id, Model model) {
		model.addAttribute("board", boardService.getBoard(id));
		return "/board/updateform";
	}

	@PostMapping("/update")
	public String update(@ModelAttribute Board board) {
		boardService.modifyBoard(board);
		return "redirect:detail?id=" + board.getId();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
