package com.ssafy.di_bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {
	public static void main(String[] args) {
		// 설정파일에 대한 경로 작성!
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		Desktop d = context.getBean("desktop", Desktop.class);
		Desktop d2 = context.getBean("desktop", Desktop.class);
		
		System.out.println(d.getInfo());
		System.out.println(d == d2);
		
	}
}
