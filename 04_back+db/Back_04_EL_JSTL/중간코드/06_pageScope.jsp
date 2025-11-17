<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL</title>
</head>
<body>
	<%
	//pageContext.setAttribute("name", "page yang");
	//request.setAttribute("name", "request yang");
	session.setAttribute("name", "session yang");
	application.setAttribute("name", "application yang");
	%>
	
	<%=pageContext.getAttribute("name")%><br>
	${pageScope.name }<br>
	${requestScope.name }<br>
	${sessionScope.name }<br>
	${applicationScope.name }<br>
	${cookie.JSESSIONID}<br>
	
	<h3>나는 누구일까?</h3>
	${name}
	
	
	
	
	
	
</body>
</html>