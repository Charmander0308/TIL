
public class Java04_Operator {
	public static void main(String[] args) {
		// 산술연산자 : 수학적인 연산
		//  +, -, *, /, %(나머지)
		// 정수와정수를 연산 -> 정수
		// 정수와실수를 연산 -> 실수
		
		int a = 100;
		double b = 21.5;
		
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		
		
		
		
		
		
		
		
		
		

		// 비교연산자 : 결과가 true/ false 값으로 나온다.
		
		int c = 100;
		int d = 1000;
		
		System.out.println( c == d );
		System.out.println( c != d );
		System.out.println( c >= d );

		
		
		
		
		
		// 논리연산자 : 해당 결과들고 t/f 형태로

		// && : 둘 다 참 -> 참
		// || : 적어도 하나 참 -> 참
		// ! : 결과를 반대로

		// 단축평가를 잘 생각해보자 (생각보다 순서 중요함)
		
		
			

		// 대입 복합 연산자
		int e = 1000;
		
		e += 10;
		e = e + 10; //위아래는 동일해~~
		
		// 단항 연산자(증감)
		int f = 100;
//		System.out.println(f++);
		System.out.println(++f);
		System.out.println(f);
		
		
		
		System.out.println(++f + f-- + f + --f); //405
		
		
		
		
		
		
		
		
		// 삼항 연산자 (조건)? (참):(거짓) 
		
		int q = 1000;
		int w = 1500;
		System.out.println(q > w ? q : w);
		
		
		
		
		
		
		
		
		
	}
}
