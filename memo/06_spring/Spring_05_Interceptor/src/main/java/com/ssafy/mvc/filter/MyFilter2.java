package com.ssafy.mvc.filter;

import java.io.IOException;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

@Component	//해당 방식의 등록은 모든 경로와 매핑을 한 것과 동일한 느낌
@Order(2)
public class MyFilter2 implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("서블릿 전2");
		chain.doFilter(request, response);
		System.out.println("서블릿 후2");
	}
	
}
