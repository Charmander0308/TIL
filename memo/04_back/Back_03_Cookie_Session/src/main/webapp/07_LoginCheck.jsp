<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
	//로그인 처리를 하려고 JSP 썼다.
	String id = request.getParameter("id");
	String pw = request.getParameter("password");
	
	//id, pw -> DB를 통해 확인을 하고 -> 맞다면 로그인 성공, 틀리면 로그인 실패
	//ssafy, 1234 면 무조건 통과
	if(id.equals("ssafy") && pw.equals("1234")){
		//로그인 성공 -> 세션에다가 저장을 해야겠다.
		session.setAttribute("loginUser", "Yang");	//ID 혹은 닉네임 정도 저장(원래는 Yang 자리에 DB에서 가져온 값을 넣는게 맞음)
		
		//HttpSession session1 = request.getSession();
		
		//페이지 이동
		//1. 포워딩 -> 적절하지 않음
		//request.getRequestDispatcher("08_...");
		//2. 리다이렉트
		response.sendRedirect("08_Main.jsp");
		
	}
	else {
		//로그인 실패
		//메인으로 튕기던지, 로그인창으로 튕기던지....
		response.sendRedirect("07_LoginForm.jsp");
	}




%>