package 동적계획법;

import java.util.Arrays;

//1, 5, 10 -> 그냥 반복문으로 나눠서 몫/나머지 처리(배수관계가 있으면 가능)
public class 동적계획법_02_동전거스름돈 {
	//활용할 수 있는 동전 1, 4, 6
	public static void main(String[] args) {
		int money = 8;	//8원. 4, 4가 best
		int[] dp = new int[money+1];	//8원까지는 거슬러줘야하니 money+1
		
		for(int i=1; i<=money; i++) {
			int minCount = Integer.MAX_VALUE;
			
			//1원을 고려하자! (1원 전의 값에 1원동전 한개 추가)
			minCount = Math.min(minCount, dp[i-1]+1);
			//4원을 고려하자!
			if(i>=4)	//1원을 이용하여 거슬러준 경우, 4원 전의 값에 4원 전의 값에 4원 동전을 한개 추가
				minCount = Math.min(minCount, dp[i-4]+1);
			//6원을 고려하자!
			if(i>=6)	//1원, 4원을 이용하여 거슬러준 경우, 6원 전의 값에 6원 동전을 한개 추가
				minCount = Math.min(minCount, dp[i-6]+1);
			
			dp[i] = minCount;	//i원을 거슬려주려고 했을 때 모든 동전을 고려했고, 가장 작은 값이 들어가 있다!(몇원 짜리 동전이 몇개인지는 모름!)
			
		}
		
		System.out.println(Arrays.toString(dp));
	
	}
	
}
