package com.ssafy.aop;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Programmer implements Person{
	//필드는 생략!
	
	//주된 일상
	public Integer coding() throws OuchException{
		System.out.println("열심히 코드를 작성한다.");	//핵심기능
		if(new Random().nextBoolean()) 
			throw new OuchException();
		
		return (int)(Math.random()*10)+1;	//시간 랜덤하게 나온다. 적당한 정수 시간
	}
}
