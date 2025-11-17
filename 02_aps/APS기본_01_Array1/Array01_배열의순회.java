
public class Array01_배열의순회 {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6 }; //길이는 7
		int N = arr.length; // 7
		
		System.out.println("정방향순회 ->");
		for(int i = 0; i<N; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println("역방향순회 <-");
		//2-1. 반복문의 조건을 건드리는 방법
		for(int i = N-1; i>=0; i-- ) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//2-2. 인덱스를 건드리는 방법(주의 요망)
		for(int i = 0; i<N; i++) {
			System.out.print(arr[N-1-i] + " ");
		}
		System.out.println();
		
		////////////////////////////////////
		//특정 인덱스를 기준으로 양쪽으로 퍼지게 순회해보세요.
		//이거는 직접 생각해서 작성해보자 (마음의숙제)
		// 0 1 2 [3] 4 5 6
		
		
		// 0 1 [2] 3 4 5 6
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
