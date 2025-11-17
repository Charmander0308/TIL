package com.ssafy.cookie;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/make")
public class MakeCookie extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//사용자가 보낸 정보는 어떤 객체?
		String key1 = req.getParameter("key");
		String value1 = req.getParameter("value");
		
		
		//쿠키 생성
		Cookie cookie = new Cookie(key1, value1);
		
		//쿠키의 만료시간(초단위)
		cookie.setMaxAge(60); //1분 , 1시간(3600), 1일 60*60*24
		
//		cookie.setMaxAge(0); //삭제랑 같다!
		
		
		resp.addCookie(cookie);
		
		resp.sendRedirect("02_CookieResult.jsp");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
