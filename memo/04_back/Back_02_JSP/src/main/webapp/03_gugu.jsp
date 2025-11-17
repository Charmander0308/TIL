<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단 출력</title>
</head>
<body>
	<h2>구구단</h2>
	<!-- 2단부터 9단까지 출력 -->
	<%
		for(int i=2; i<=9; i++){
			out.println("=====" + i + "단=====");
	%>
		<br>
	<%
			for(int j=1; j<=9; j++){
				//out.print(i + "x" + j + "=" +(i*j));
				out.println(i + "x" + j + "=" +(i*j));
	%>
		<br>
	<%
				//out.println(i + "x" + j + "=" +(i*j) + "<br>");
			}
		}
	
	%>
	
	<a href="index.html">홈으로</a>
</body>
</html>