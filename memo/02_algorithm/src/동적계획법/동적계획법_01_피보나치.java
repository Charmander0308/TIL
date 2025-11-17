package 동적계획법;

import java.util.Arrays;

public class 동적계획법_01_피보나치 {
	static int[] memo = new int[1000];
	static {
		Arrays.fill(memo, -1);
		memo[0] = 0;
		memo[1] = 1;
	}
	
	public static void main(String[] args) {
		System.out.println(fibo(40));
	}
	
	static int fibo(int N) {
		//fibo(n) 뭔지 몰라~
		if(memo[N] == -1) {
			memo[N] = fibo(N-1) + fibo(N-2);
		}
		return memo[N];
	}
}
