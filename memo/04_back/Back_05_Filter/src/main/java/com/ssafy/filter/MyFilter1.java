package com.ssafy.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;

public class MyFilter1 extends HttpFilter implements Filter {
       
    public MyFilter1() {

    }

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//인코딩 설정을 바꾸고싶다~
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		//요부분에 코드를 작성하면.. -> 전처리
		System.out.println("필터1 요청");
		chain.doFilter(request, response);
		//요부분에 코드를 작성하면.. -> 후처리
		System.out.println("필터1 응답");

	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
