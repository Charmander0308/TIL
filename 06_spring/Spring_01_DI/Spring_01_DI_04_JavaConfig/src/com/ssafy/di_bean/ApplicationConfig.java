package com.ssafy.di_bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationConfig {

	@Bean
//	@Scope()
	public Desktop desktop() {
		return new Desktop();
	}
	
	
	@Bean
	public Programmer programmer() {
		//설정자주입
//		Programmer p = new Programmer();
//		p.setComputer(desktop());
//		
//		return p;
		
		//생성자주입
		Programmer p2 = new Programmer(desktop());
		return p2;
	}
	
	
	
	
	
	
	
	
	
	
}
