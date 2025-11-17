
public class 조합_02_반복문 {
	public static void main(String[] args) {
		int N = 5;
		int R = 3;
		int[] arr = { 0, 1, 2, 3, 4 };
		// 반복문을 이용해서 짜는 코드는 R개가 고정적일 때 사용할 수 있음
		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					System.out.println(arr[i]+","+arr[j]+","+arr[k]);
				}
			}
		}
		
		
		//2개만 뽑자
		for(int i = 0 ; i<N-1; i++) {
			for(int j = i+1; j<N; j++) {
				//2개를 뽑는 모든 경우의수가 나옴!
			}
		}

	}
}
