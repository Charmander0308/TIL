package com.ssafy.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test2 {
	public static void main(String[] args) {
		//설정파일에 대한 경로작성
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		
		Programmer p = context.getBean("programmer", Programmer.class);
		
		p.coding();
	}
}
