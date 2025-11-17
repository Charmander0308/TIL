package string;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class String01_생성 {
	public static void main(String[] args) {
		//1. 리터럴 사용 -> String Pool
		String str1 = "hello";
		String str2 = "hello";	//두 개의 변수는 하나의 "Hello"를 가리키고 있다.
		
		System.out.println(str1 == str2);		//주소 비교 : true
		System.out.println(str1.equals(str2));	//내용물 비교 : true
		
		//2. 힙에 직접 생성
		String str3 = new String("hello");
		System.out.println(str1 == str3);		//주소 비교 : false
		System.out.println(str1.equals(str3));	//내용물 비교 : true
		
		//3. byte 배열을 이용
		byte[] bytes = new byte[] {65, 66, 67};
		String str4 = new String(bytes, StandardCharsets.UTF_8);
		System.out.println(str4);
		
		///////////////////////////////////////
		//문자열은 불변성! -> 중간 문자를 바꾸고 싶다! -> 문자의 배열로 바꾸고 -> 값을 갱신한 뒤 -> 다시 문자열로 바꿈
		
		//1. 문자 분해해서 배열에 넣고 돌리기
		char[] cArr1 = new char[str1.length()];
		for(int i = 0; i < cArr1.length; i++) {
			cArr1[i] = str1.charAt(i);
		}
		System.out.println(Arrays.toString(cArr1));
		
		//2. 이미 있는 메서드 활용
		char[] cArr2 = str1.toCharArray();
		System.out.println(Arrays.toString(cArr2));
		
		//Java에서 문자 한개를 입력받는 방법 X
		Scanner sc = new Scanner(System.in);
//		sc.next().charAt(0);	//해당 방식으로 문자열을 입력받을 수 있다!
		
		//패턴매칭 
		System.out.println(str1.contains("la"));
		
	}

}
