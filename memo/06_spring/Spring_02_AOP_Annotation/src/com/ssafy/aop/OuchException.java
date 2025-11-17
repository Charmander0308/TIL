package com.ssafy.aop;

public class OuchException extends Exception{
	public void handleException() {
		System.out.println("병원 간다~~");
	}
}
