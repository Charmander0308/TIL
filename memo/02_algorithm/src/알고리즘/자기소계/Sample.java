package 알고리즘.자기소계;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sample {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("src/알고리즘/자기소계/input.txt");
		Scanner sc = new Scanner(file);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			//입력을 다 받고
			int[][] arr = new int[N][N];
			//1번째
			for(int r = 0; r < N; r++) {
				//2번째
				for(int c = 0; c < N; c++) {
					arr[r][c] = sc.nextInt();				
				}
			}
			//그 다음에 탐색 시작
//			for(int i = 0; i < N; i++) {
//				System.out.println(Arrays.toString(arr[i]));
//			}
			
			
			
		}
		
	}

}
