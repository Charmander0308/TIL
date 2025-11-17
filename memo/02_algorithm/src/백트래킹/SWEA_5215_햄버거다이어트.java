package 백트래킹;

import java.util.Scanner;

public class SWEA_5215_햄버거다이어트 {
	static int N, L;	//재료의 수, 제한 칼로리
	//재료의 점수와 칼로리를 관리
	//1. 재료 클래스를 만들어서 배열로 관리한다.
	//2. 2차원 배열을 이용하여 [0] 점수, [1] 칼로리를 관리한다.
	//3. 각각 1차원 배열로 관리한다.
	static int[] scores;
	static int[] cals;
	static int ans;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			N = sc.nextInt();
			L = sc.nextInt();
			scores = new int[N];
			cals = new int[N];
			ans = 0;	//왜 0으로 초기화했는가? -> 최대값을 구할거라서
			for(int i=0; i<N; i++) {
				scores[i] = sc.nextInt();
				cals[i] = sc.nextInt();
			}//입력 끝
			
			make(0, 0, 0);
			System.out.println(ans);
		}
	}
	
	//정석 부분집합
	//1. 비트마스킹 이용
	//2. 재귀함수
	//3. 백트래킹 -> 유망성 검사를 하겠다.
	static void make(int idx, int sumCal, int sumScore) {
		//지금 모든 재료를 판단하지는 않았지만... 제한 칼로리를 벗어나 버렸으면..
		//더이상의 의미는 없다
		if(sumCal > L) return;
		
		//모든 재료 판단 끝
		if(idx == N) {
			//맛의 포인트를 구해보자~
			ans = Math.max(ans, sumScore);	//무슨 재료를 썼는지도 중요하면 이렇게 풀면 안됨!!(알 수가 없음) -> 그땐 부분집합으로 해야함
			return;
		}
		
		//재료를 사용한 경우
		make(idx+1, sumCal + cals[idx], sumScore + scores[idx]);
		
		//재료를 사용하지 않은 경우
		make(idx+1, sumCal, sumScore);
	}
}
