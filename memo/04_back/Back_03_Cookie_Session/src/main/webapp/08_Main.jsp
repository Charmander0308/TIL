<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인화면</title>
</head>
<body>
	<header>
		<%
			if(session.getAttribute("loginUser") == null){
				//로그인 할 수 있는 form을 보여주던지
				//로그인 페이지로 이동할 수 있는 링크를 보여주던지
				response.sendRedirect("07_LoginForm.jsp");
			}else{
				out.println(session.getAttribute("loginUser") + "님 반갑습니다.");
			}
		%>
		
		<form action="07_Logout.jsp" method="POST">
			<button>로그아웃</button>
		</form>
		<a href="07_Logout.jsp">로그아웃링크</a>
	</header>
	<main>
		<h2>메인 블라블라</h2>
		
		
	</main>
	
</body>
</html>