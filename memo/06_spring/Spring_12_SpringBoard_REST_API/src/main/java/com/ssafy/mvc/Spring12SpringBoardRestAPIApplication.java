package com.ssafy.mvc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.ssafy.mvc.model.dao")
public class Spring12SpringBoardRestAPIApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring12SpringBoardRestAPIApplication.class, args);
	}

}
