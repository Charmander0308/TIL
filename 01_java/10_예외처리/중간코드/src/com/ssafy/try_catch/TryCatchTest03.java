package com.ssafy.try_catch;

//다중 처리
public class TryCatchTest03 {
	public static void main(String[] args) {
		int[] nums = { 10 }; // 선언과 동시에 초기화할때만 가능한 문법

//		try {
//			System.out.println("정상 코드 1");
//			// 코드는 엄청나게 많이 쓸거야!!
//			System.out.println(10 / 0);
//			System.out.println(nums[10]); // 예외가 발생할 수도 있는 코드!
//			System.out.println("정상 코드 2");
//		} catch (ArithmeticException e) {
//			System.out.println("수학적 이슈 예외처리 구문");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("인덱스 예외처리 구문");
//		} catch (Exception e) {
//			System.out.println("이외의 모든 예외처리 구문");
//		}
//		System.out.println("프로그램 끝");

		// 예외는 다형성 처리가 가능하다
		// 조상을 먼저 작성해버리면.... -> 아래의 코드들은 동작할 기회를 잃어버림.
		try {
			System.out.println("정상 코드 1");
			// 코드는 엄청나게 많이 쓸거야!!
			System.out.println(10 / 0);
			System.out.println(nums[10]); // 예외가 발생할 수도 있는 코드!
			System.out.println("정상 코드 2");
		} catch (Exception e) {
			System.out.println("이외의 모든 예외처리 구문");
			e.getMessage();
			e.printStackTrace();
		}
//		catch (ArithmeticException e) {
//			System.out.println("수학적 이슈 예외처리 구문");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("인덱스 예외처리 구문");
//		}
		System.out.println("프로그램 끝");

	}
}
