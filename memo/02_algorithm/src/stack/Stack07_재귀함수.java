package stack;

public class Stack07_재귀함수 {
	static int cnt = 0;
	
	public static void main(String[] args) {
//		function1();
		function2(10);
		System.out.println("다시 main으로");
		
	}
	
	public static void function1() {
		System.out.println("function1 호출" + cnt++);
		function1();
	}
	
	public static void function2(int num) {
		//1. 기본 부분(재귀를 끝내는 조건)
		if(num < 0) {
			return;
		}
		//2. 재귀를 호출하는 부분
		else {
			System.out.println("function2 호출" + num);
			function2(num - 1);
		}
	}
}
