<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>반찬고르기</title>
</head>
<body>
	<h2>반찬을 골라보자</h2>
	<form action="10_checkBoxResult.jsp">
		<input type="checkbox" name="dish" value="제육볶음">제육볶음
		<input type="checkbox" name="dish" value="더덕구이">더덕구이
		<input type="checkbox" name="dish" value="더덕무침">더덕무침 <br>
		<input type="checkbox" name="dish" value="계란말이">계란말이
		<input type="checkbox" name="dish" value="갈비찜">갈비찜
		<input type="checkbox" name="dish" value="진미채">진미채
		<button>구매</button>
	</form>
</body>
</html>