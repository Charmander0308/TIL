package com.ssafy.board.model.repository;

import java.util.List;

import com.ssafy.board.model.dto.Board;

public interface BoardRepository {
	//전체 게시글 가져오기
	public abstract List<Board> selectAll();

	//게시글 조회하기
	public abstract Board selectOne(int id);

	//게시글 등록하기
	public abstract void insertBoard(Board board);

	//게시글 수정하기
	public abstract void updateBoard(Board board);

	//게시글 삭제하기
	public abstract void deleteBoard(int id);

	//게시글 조회수 증가
	public abstract void updateViewCnt(int id);

}
