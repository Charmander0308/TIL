package com.ssafy.mvc.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ssafy.mvc.filter.MyFilter;

//설정파일을 만들자
@Configuration
public class FilterConfig {
	
	@Bean
	public FilterRegistrationBean<MyFilter> myFilter() {
		FilterRegistrationBean<MyFilter> filterRegistrationBean = new FilterRegistrationBean<>();
		filterRegistrationBean.setFilter(new MyFilter());	//어떤 필터를 등록할지
		filterRegistrationBean.addUrlPatterns("/hello");	//어떤 경로에 등록할지
		filterRegistrationBean.setOrder(1);					//어떤 순서로 등록할지
		
		return filterRegistrationBean;
	}
}
