
//기초자료형 / 참조자료형의 차이를 명확하게 인지하고 있으면
//아래의 코드가 조금 더 수월하게 이해될지도?

import java.util.Arrays;

public class Stack04_함수호출 {
	public static void main(String[] args) {
		System.out.println("메인함수 실행");
		int a = 10;
		function1();
		System.out.println(a);
		System.out.println("메인함수 종료");
	}

	private static void function1() {
		System.out.println("함수1 실행");
		int a = 20;
		int[] arr = {1,2,3};
		System.out.println(Arrays.toString(arr));
		function2(a, arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(a);
		System.out.println("함수1 종료");
	}

	//void가 아니라 int[] 을 반환하도록 수정하면 저거 34번라인 내용을 들고 나갈수 있을지도?
	private static void function2(int a, int[] arr) {
		System.out.println("함수2 실행");
		System.out.println(a);
		a = 30;
//		arr[1] = 1000;
		//참조 자료형의 대한 이해도를 높이자!
//		arr = new int[] {10,20,30};
		System.out.println(a);
		System.out.println("함수2 종료");
	}
}
