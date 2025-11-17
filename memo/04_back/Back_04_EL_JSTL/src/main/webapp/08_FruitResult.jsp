<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>과일선택</title>
</head>
<body>
	<!-- 단일 조건 처리 -->
	<c:if test="${param.fruit == 1}">
		<div style="color: Yellow">파인애플</div>
	</c:if>
	<c:if test="${param.fruit == 2}">
		<div style="color: pink">망고스틴</div>
	</c:if>
	<c:if test="${param.fruit == 3}">
		<div style="color: green">멜론</div>
	</c:if>
	<c:if test="${param.fruit == 4}">
		<div style="color: red">사과</div>
	</c:if>
	
	<hr>
	
	<!-- 다중 조건 처리 -->
	<c:choose>
		<c:when test="${param.fruit == 1}">
			<div style="color: Yellow">파인애플</div>
		</c:when>
		<c:when test="${param.fruit == 2}">
			<div style="color: pink">망고스틴</div>
		</c:when>
		<c:when test="${param.fruit == 3}">
			<div style="color: green">멜론</div>
		</c:when>
		<c:when test="${param.fruit == 4}">
			<div style="color: red">사과</div>
		</c:when>
		<c:otherwise>
			<div>선택받지 못한 과일들이다.</div>
		</c:otherwise>
	</c:choose>

</body>
</html>