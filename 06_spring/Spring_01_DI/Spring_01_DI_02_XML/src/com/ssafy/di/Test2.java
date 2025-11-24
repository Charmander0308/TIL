package com.ssafy.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test2 {
	public static void main(String[] args) {
		// 설정파일에 대한 경로 작성!
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext2.xml");
		System.out.println("1");

		Programmer p = context.getBean("programmer", Programmer.class);
		
		System.out.println("2");
		p.coding();
	}
}
