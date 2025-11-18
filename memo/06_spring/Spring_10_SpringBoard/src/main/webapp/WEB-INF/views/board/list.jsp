<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체목록</title>
<%@ include file="../common/bootstrap.jsp" %>
</head>
<body>
	<div class="container">
		<h2>게시글 목록</h2>
		<%@include file="../common/header.jsp" %>
		<hr>
		<%@ include file="../common/searchForm.jsp" %>
		<table class="table">
			<tr>
				<th>글번호</th>
				<th>글제목</th>
				<th>글쓰니</th>
				<th>조회수</th>
				<th>작성일</th>
			</tr>
			<c:forEach items="${boardList}" var="board">
				<tr>
					<td>${board.id}</td>
					<td><a href="detail?id=${board.id}">${board.title}</a></td>
					<td>${board.writer}</td>
					<td>${board.viewCnt}</td>
					<td>${board.regDate}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>