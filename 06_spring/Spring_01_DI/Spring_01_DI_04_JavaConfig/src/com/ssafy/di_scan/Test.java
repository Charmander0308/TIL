package com.ssafy.di_scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		// 설정파일에 대한 경로 작성!
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Programmer p = context.getBean("p", Programmer.class);
		p.coding();

	}
}
