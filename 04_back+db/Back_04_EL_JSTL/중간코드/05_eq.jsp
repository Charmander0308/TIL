<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL</title>
</head>
<body>
	<!-- 파라미터를 꺼내서 보자 id라고 하는 파라미터가 넘어왔다! -->
	<!-- JSP -->
<%-- 	<%= request.getParameter("id") %> <br>
	<%= request.getParameter("id") == "ssafy" %> <br>
	<%= request.getParameter("id").equals("ssafy")%> <br>
	 --%>
	<!-- EL -->
	${param.id} <br>
	${param.id == "ssafy"} <br>
	${param.id eq "ssafy"} <br>
	
	
	
	

</body>
</html>