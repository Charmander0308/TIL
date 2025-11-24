package com.ssafy.di;

public class Desktop implements Computer {
	private String CPU;
	private String RAM;
	private String SSD;
	private String GPU;
	
	//설정자,접근자 
	//생성자
	
	public String getInfo() {
		return "데스크톱";
	}
	
}
