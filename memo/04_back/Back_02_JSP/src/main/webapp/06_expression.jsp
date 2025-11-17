<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%!
	int A = 10;
	int B = -20;
	
	String name = "SSAFY";
	
	int abs(int a){
		return a > 0 ? a : -a;
	}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현식</title>
</head>
<body>
	<% out.print(name); %>
	<%= name %>
	<%= abs(B) %>
	<a href="index.html">홈으로</a>
</body>
</html>