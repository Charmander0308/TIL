<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.ssafy.dto.Person" %>   
<%@ page import="java.util.Arrays" %>   

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과</title>
</head>
<body>
	<% 
	//instanceof 를 통해 확인하고, 맞으면 바꿔줘잉! 을 원래는 해야함
	
	Person p = (Person)request.getAttribute("person"); %>
	<table>
		<tr>
			<td>이름</td>
			<td><%=request.getParameter("name") %></td>
		</tr>
		<tr>
			<td>나이</td>
			<td><%=p.getAge() %></td>
		</tr>
		<tr>
			<td>성별</td>
			<td><%=p.getGender() %></td>
		</tr>
		<tr>
			<td>취미</td>
			<td><%=Arrays.toString(p.getHobbies()) %></td>
		</tr>
	</table>
	<a href="regist.jsp">홈으로</a>
</body>
</html>