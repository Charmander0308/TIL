<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선언부</title>
</head>
<body>
	<%! int C = 10; 
		//함수작성 가능!
		int add(int A, int B){
			return A+B;
		}
	%>
	<% int D = 100; 
		//함수작성 불가능! (서비스 메서드 안에 정의되는 지역변수)
		/* int add2(int A, int B){
			return A+B;
		} */
	%>
	
	<a href="index.html">홈으로</a>
</body>
</html>