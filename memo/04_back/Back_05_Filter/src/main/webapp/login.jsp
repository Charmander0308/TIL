<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action="main" method="post">
    	<input type="hidden" name="act" value="login">
    	id : <input type="text" name="id"><br>
    	pw : <input type="password" name="pw"><br>
    	<button>로그인</button>
    </form>
</body>
</html>