package com.ssafy.board.model.service;

import java.util.List;

import com.ssafy.board.model.dto.Board;

public interface BoardService {
	// 전체 게시글 조회
	public abstract List<Board> getList();
	
	// 게시글 조회
	public abstract Board getBoard(int id);

	// 게시글 작성
	public abstract void writeBoard(Board board);

	// 게시글 수정
	public abstract void modifyBoard(Board board);

	// 게시글 삭제
	public abstract void removeBoard(int id);

}
