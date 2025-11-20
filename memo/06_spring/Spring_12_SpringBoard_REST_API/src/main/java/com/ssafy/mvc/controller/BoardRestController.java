package com.ssafy.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.mvc.model.dto.Board;
import com.ssafy.mvc.model.dto.SearchCondition;
import com.ssafy.mvc.model.service.BoardService;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api-board")
@Tag(name = "Board RESTful API", description = "게시글 CRUD를 할 수 있는 REST API")
public class BoardRestController {
	
	//서비스 의존성 필요해!
	private final BoardService boardService;

//	@Autowired
	public BoardRestController(BoardService boardService) {
		this.boardService = boardService;
	}
	
	//게시글 전체 조회
//	@GetMapping("/board")
//	public ResponseEntity<List<Board>> list(){
//		List<Board> list = boardService.getBoardList();
////		return new ResponseEntity<>(list, HttpStatus.OK);
//		return ResponseEntity.ok(list);
//	}
	
	//게시글 검색 조회
	@GetMapping("/board")
	@Operation(summary = "게시글 조회(검색 가능)", description = "조건을 명시하여 게시글을 검색할 수 있다. 아니면 전체 조회다.")
	public ResponseEntity<?> list(@ModelAttribute @Parameter(description = "입력받은 검색어에 대한 정보") SearchCondition condition){
		System.out.println(condition);
		
		List<Board> list = boardService.search(condition);
		if(list == null || list.size() == 0) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<List<Board>>(list, HttpStatus.OK);
	}
	
	@GetMapping("/board/{id}")
	public ResponseEntity<Board> detail(@PathVariable("id") int id){
		Board board = boardService.readBoard(id);
		if(board != null) {
			return ResponseEntity.ok(board);
		}
		//board가 null인 상황 -> URL을 직접 작성해서 들어오는 경우
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
	//게시글 등록(Form)
	@PostMapping("/board")
	public ResponseEntity<Void> write(@ModelAttribute Board board){
		System.out.println(board);
		boardService.writeBoard(board);
		System.out.println(board);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	//게시글 삭제
	@DeleteMapping("/board/{id}")
	@Hidden
	public ResponseEntity<String> delete(@PathVariable("id") int id){
		boolean isDeleted = boardService.removeBoard(id);
		if(isDeleted) {
			return ResponseEntity.status(HttpStatus.OK).body("Board Delete");
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed");
	}
	
	//게시글 수정(JSON)
//	@PutMapping("/board")
	@PutMapping("/board/{id}")
	public ResponseEntity<Void> update(@PathVariable("id") int id, @RequestBody Board board){
		board.setId(id);
		boardService.modifyBoard(board);
		
		//분기처리
		//1. id가 없을 수도?
		//2. 수정할 데이터 완벽하지 않을 수도?
		//3. 정상적으로 수정이 되지 않았을 수도?
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
}
