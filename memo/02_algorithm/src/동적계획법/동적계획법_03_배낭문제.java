package 동적계획법;

import java.util.Scanner;

public class 동적계획법_03_배낭문제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =  sc.nextInt();	//물건의 개수
		int W =  sc.nextInt();	//배낭의 무게
		
		//무게와 값어치를 가진 입력이 주어진다.
		int[] weights = new int[N+1];	//1번부터
		int[] cost = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			weights[i] = sc.nextInt();
			cost[i] = sc.nextInt();
		}
		
		int[][] dp = new int[N+1][W+1];
		
		//물건은 한 개씩만 존재
		for(int i=1; i<=N ;i++) {
			for(int w=0; w<=W; w++) {
				//1. 내가 고려할 물건의 무게가 임시무게(w)보다 작거나 같으면
				if(weights[i] <= w) {
					dp[i][w] = Math.max(dp[i-1][w], dp[i-1][w-weights[i]]+cost[i]);
				} 
				//2. 내가 고려할 물건의 무게보다 임시무게(w)가 작은 경우
				else {
					dp[i][w] = dp[i-1][w];
				}
				
				
			}
		}//물건을 고려할건데 점점 한 개씩 늘려가겠다.
		
	}
}
