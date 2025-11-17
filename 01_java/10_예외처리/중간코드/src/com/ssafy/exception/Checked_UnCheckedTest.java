package com.ssafy.exception;

public class Checked_UnCheckedTest {
	
	public static void main(String[] args) {
		
		//1. Unchecked 
		//런타임 계열 -> 프로그래머의 실수 / 컴파일시 대처 코드가 없어도 OK
		int[] nums = {10};
		System.out.println(nums[10]);
		
		//2. Checked
		//Exception 계열 -> 컴파일시 대처 코드가 없으면 안 OK
//		Class.forName(null);
//		Thread.sleep(0);
		
	}
}
