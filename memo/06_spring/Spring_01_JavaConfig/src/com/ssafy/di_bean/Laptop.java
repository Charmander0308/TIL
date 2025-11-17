package com.ssafy.di_bean;

public class Laptop implements Computer {
	private String CPU;
	private String RAM;
	private String SSD;
	private String GPU;
	
	//설정자, 생성자
	
	public String getInfo() {
		return "랩톱";
	}
}
