<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
	<% 
		//1. 로그인 유저를 지우자
		//session.removeAttribute("loginUser");
	
		//2. 세션 자체를 지우자
		session.invalidate();
		
		response.sendRedirect("index.html");
	
	%>