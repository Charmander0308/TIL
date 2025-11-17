package com.ssafy.mvc.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Component
public class LoginCheckInterceptor implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//특정 작업을 수행하려고 했을때 로그인 했는지 체크를 해보자~
		//로그인 정보는 Session에 저장을 했다!
		HttpSession session = request.getSession();
		if(session.getAttribute("loginUser") == null) {
			//해당조건문에 통과가 되었다! -> 로그인 x
			response.sendRedirect("login");
		}
		
		return true;
	}
	
}
