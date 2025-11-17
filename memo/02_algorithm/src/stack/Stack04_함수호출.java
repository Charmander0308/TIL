package stack;

//기초 자료형 <-> 참조 자료형 차이를 잘 알면 이해 쉬움

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
		function2(a);
		System.out.println(a);
		System.out.println("함수1 종료");
	}
	
	private static void function2(int a) {
		System.out.println("함수2 실행");
		System.out.println(a);
		a = 30;
		System.out.println(a);
		System.out.println("함수2 종료");
	}

}
