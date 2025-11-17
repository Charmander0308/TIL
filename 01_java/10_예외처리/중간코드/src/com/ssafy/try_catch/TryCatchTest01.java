package com.ssafy.try_catch;

public class TryCatchTest01 {
	public static void main(String[] args) {
		int[] nums = { 10 }; // 선언과 동시에 초기화할때만 가능한 문법

		try {
			System.out.println("정상 코드 1");
			System.out.println(nums[10]); // 예외가 발생할 수도 있는 코드!
			System.out.println("정상 코드 2");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 발생 처리 코드");
		}
		System.out.println("프로그램 끝");
		
	}
}
