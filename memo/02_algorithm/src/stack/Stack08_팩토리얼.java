package stack;

public class Stack08_팩토리얼 {
	public static void main(String[] args) {
		//재귀의 흐름을 연습할 때는 손으로 그리며 많이 해보자~
		System.out.println(fact(5));

		System.out.println(fact(13));
		System.out.println(fact(14));
		System.out.println(fact(15));
		
	}
	
	public static long fact(int n) {
		//1. 기본 부분
		if(n <= 1) return 1;	//정답은 없고 문제를 보며 판단하자
		
		//2. 재귀 부분
		return n*fact(n - 1);

	}
	
}
