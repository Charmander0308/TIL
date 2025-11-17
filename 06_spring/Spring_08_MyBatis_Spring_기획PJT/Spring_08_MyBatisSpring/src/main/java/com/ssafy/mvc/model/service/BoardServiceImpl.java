package com.ssafy.mvc.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.mvc.model.dao.BoardDao;
import com.ssafy.mvc.model.dto.Board;

@Service
public class BoardServiceImpl implements BoardService{

	private final BoardDao boardDao;
	
	public BoardServiceImpl(BoardDao boardDao) {
		this.boardDao = boardDao;
	}
	
	@Override
	public List<Board> getBoardList() {
		System.out.println("게시글 전체 목록");
		return boardDao.selectAll();
	}

	@Override
	public Board readBoard(int id) {
		System.out.println("게시글 상세 조회");
		boardDao.updateViewCnt(id);
		return boardDao.selectOne(id);
	}

	@Override
	public void writeBoard(Board board) {
		System.out.println("게시글 작성");
		boardDao.insertBoard(board);
	}

	@Override
	public void removeBoard(int id) {
		System.out.println("게시글 삭제");
		boardDao.deleteBoard(id);
	}

	@Override
	public void modifyBoard(Board board) {
		System.out.println("게시글 수정");
		boardDao.updateBoard(board);
		
	}

	@Override
	public Board getBoard(int id) {
		return boardDao.selectOne(id);
	}

}
