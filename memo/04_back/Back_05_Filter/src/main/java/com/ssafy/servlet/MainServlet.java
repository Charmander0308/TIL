package com.ssafy.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/main")
public class MainServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String act = request.getParameter("act");
		switch (act) {
		case "login":
			doLogin(request, response);
			break;

		}
		
		
	}

	private void doLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//UserManager -> 더미데이터를 몇개 넣어두고, 거기 있는 사람인지 체크하면 좋겠다..
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		//id, pw 통해 유저인지 쳌
		if(id != null && pw != null) {
			//세션에다가 저장
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", id);
			
			response.sendRedirect("index.html");
			
		} else {
			//로그인실패!
			//1. 메인으로 튕기기 / 2. 로그인페이지 다시 보여주기
			response.sendRedirect("/login.jsp");
		}
		
		
		
		
	}
}
