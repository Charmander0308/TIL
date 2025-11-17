<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인페이지</title>
</head>
<body>
	<h3>로그인페이지</h3>
	<form action="07_LoginCheck.jsp" method="POST">
		<input type="hidden" name="action" value="login">
		<input type="text" placeholder="아이디입력" name="id">
		<input type="password" placeholder="비밀번호입력" name="password">
		<button>로그인</button>
	</form>
</body>
</html>