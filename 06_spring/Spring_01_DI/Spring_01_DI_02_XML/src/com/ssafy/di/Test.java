package com.ssafy.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// 설정파일에 대한 경로 작성!
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");

		Desktop desktop = (Desktop) context.getBean("desktop");
		Desktop desktop2 = (Desktop) context.getBean("desktop");
		Programmer p = context.getBean("programmer", Programmer.class);

		p.setComputer(desktop);

		p.coding();
		
		System.out.println(desktop == desktop2);

	}
}
