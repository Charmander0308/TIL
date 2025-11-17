
public class Java06_반복문1 {
	public static void main(String[] args) {
		// for (초기화; 조건식; 증감식) { 반복 내용}
		// 조건식을 비워두면 항상 참으로 인식해서 끝나지 않음
		// 반복 횟수를 알고 있을 때 사용하면 좋다.

		for(int i = 0; i<5; i++) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		for(int i=0, j=10; i < 10 && j >=20 ; i+=10, j--) {
			System.out.println(i);
		}
		
//		for() {
//			for() {
//				//구구단 도 출력이 가능하다.
//			}
//		}
	}
}
