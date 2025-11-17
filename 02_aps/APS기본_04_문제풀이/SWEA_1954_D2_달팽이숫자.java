import java.util.Scanner;

public class SWEA_1954_D2_달팽이숫자 {
	public static void main(String[] args) {
		// 입력 받기 위해서 Scanner
		Scanner sc = new Scanner(System.in);

		// 테스트케이스 수가 주어지고...
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt(); // NxN크기의 배열 1<=N<=10
			int[][] arr = new int[N][N]; //채운다!
			
			int K = N; //이동할 칸의 수
			int D = 1; //증감 1 -> -1 -> 1
			//현재좌표
			int r = 0;
			int c = -1;
			int num = 1;
			//반복문을 수행하면서 처리하자~~
			//무한루프
			while(true) {
				//수평->수직 : 이동거리가 하나 줄어든다!
				for(int i = 0 ; i<K; i++) {
					c += D; //D 때로는 1 때로는 -1
					arr[r][c] = num++;
				} //수평을 채웠다...
				K--;
				//종료조건!
				//1. K == 0 : 더이상 이동할 수 없어!
				//2. (r,c) : 중앙 좌표일 때 (주의 필요)
				//3. num == NxN
				
				if(K == 0) break; //종료조건
				
				//수직->수평 : 증감방향이 바뀐다.
				for(int i = 0; i<K; i++) {
					r += D;
					arr[r][c] = num++;
				}//수직을 채웠다...
				D = -D;
			}//달팽이 채우기
			
			System.out.println("#"+tc);
			for(int i =0; i<N; i++) {
				for(int j =0; j<N; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			
		} // tc for문

	}// main
}
