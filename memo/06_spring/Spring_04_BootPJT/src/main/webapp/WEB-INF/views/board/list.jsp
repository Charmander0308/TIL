<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 목록</title>
</head>
<body>
	<h2>글 제목 리스트</h2>
	<c:if test="${empty boardList}">
		<h4>게시글이 하나도 없어요 ㅠ</h4>
	</c:if>
	<ul>
		<c:forEach items="${boardList}" var="board">
			<li>${board.title}</li>
		</c:forEach>
	</ul>
	<a href="/writeform">게시글 등록</a>
	
</body>
</html>