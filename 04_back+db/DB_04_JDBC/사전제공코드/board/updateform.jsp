<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 수정</title>
</head>
<body>
	<h2>글 수정</h2>
	<form action="board" method="POST">
		<input type="hidden" name="action" value="update">
		<input type="hidden" name="id" value="${board.id}">
 		<div>
			글 제목 : <input type="text" name="title" value="${board.title}">
		</div>
		<div>
			글 쓰니 : <input type="text" name="writer" value="${board.writer}" readonly>
		</div>
		<div>
			글 내용 : <textarea rows="10" cols="30" name="content">${board.content}</textarea>
		</div>
		<div>
			<input type="submit" value="게시글 수정">
		</div>
	</form>
</body>
</html>