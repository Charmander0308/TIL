<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL</title>
</head>
<body>
	<!-- c:out  -->
	<c:out value="Hello SSAFY!"></c:out> <br>
	<c:out value="Hello SSAFY!"/> <br>
	
	<!-- c:set -->
	<c:set var="msg1" value="message1"/>
	<c:set var="msg2">message2</c:set>
	${msg1 } <br>
	${msg2 } <br>
	
	<c:set var="p" value="<%=new com.ssafy.dto.Person() %>"/>
	<c:set target="${p }" property="name" value="Yang"></c:set>
	${p } <br>
	

</body>
</html>