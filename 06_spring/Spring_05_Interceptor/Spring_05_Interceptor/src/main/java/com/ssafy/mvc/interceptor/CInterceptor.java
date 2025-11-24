package com.ssafy.mvc.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class CInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// boolean 반환: true gogo / false 그만훼
		System.out.println("C : pre");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// 컨트롤러를 찍고 온 상태 -> M&V 객체가 있다
		// 예외 발생시 실행하지 않음
		System.out.println("C : POST");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// View 전달된 후 실행(finally 같은 녀석)
		// 예외는 평소에는null / 발생시 객체가 채워짐
		System.out.println("C : after");
	}
}
