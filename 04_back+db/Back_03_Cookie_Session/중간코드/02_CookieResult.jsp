<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키생산공장</title>
</head>
<body>
	<h2>현재 내브라우저에 있는 쿠키 정보</h2>
	<!-- 해당 페이지가 보일때 쿠키도 같이 넘어왔다! -->
	<%
	Cookie[] cookies = request.getCookies();
	if (cookies != null) {
		for (Cookie c : cookies) {
			out.println(c.getName() + ":" + c.getValue() + "<br>");
		}

	}
	%>




	<a href="index.html">홈으로</a>
</body>
</html>