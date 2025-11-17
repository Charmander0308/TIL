package com.ssafy.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("p")
public class Programmer {
	private String name;
	private int age;
	
	//느슨한 결합을 했다.
	private Computer computer;
	
	public Programmer() {
		System.out.println("프로그래머가 고용되었다.");
	}
	
	//생성자 주입을 했다!
	@Autowired
	public Programmer(Computer computer) {
		this.computer = computer;
	}
	
	//설정자 주입을 했다!
	@Autowired
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	//메서드 주입을 했다!(여러개를 동시에 넣을 수도 있음)
	
	
	public void coding() {
		System.out.println(computer.getInfo() + "으로 개발을 합니다.");
	}
	
	
}
