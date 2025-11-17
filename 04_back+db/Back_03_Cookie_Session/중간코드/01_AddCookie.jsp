<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키생산공장</title>
</head>
<body>
	<h2>쿠키 설정</h2>
	<form action="make" method="GET">
		이름 : <input type="text" name="key"> <br>
		내용 : <input type="text" name="value"> <br>
		<button>생성</button>
	</form>
</body>
</html>