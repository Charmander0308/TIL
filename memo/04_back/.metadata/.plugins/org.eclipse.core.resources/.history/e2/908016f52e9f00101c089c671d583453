<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 상세</title>
</head>
<body>
	<h2>게시글 상세</h2>
	
	<div>id : ${board.id }</div>
	<div>제목 : ${board.title }</div>
	<div>글쓰니 : ${board.writer }</div>
	<div>등록일 : ${board.regDate }</div>
	<div>조회수 : ${board.viewCnt }</div>
	<div>내용 : ${board.content }</div>
	
	<div>
		<a href="board?action=delete&id=${board.id}">삭제</a>
	</div>
	<div>
		<a href="board?action=updateform&id=${board.id}">수정</a>
	</div>
	<div>
		<a href="board?action=list">목록</a>
	</div>
</body>
</html>