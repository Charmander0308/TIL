<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 등록</title>
</head>
<body>
	<form action="write" method="post">
		<div>
			<input type="text" name="title" placeholder="제목입력">
		</div>
		<div>
			<textarea rows="10" cols="10" name="content"></textarea>
		</div>
		<div>
			<button>등록</button>
		</div>
	</form>
</body>
</html>