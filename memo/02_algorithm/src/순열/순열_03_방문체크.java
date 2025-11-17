package 순열;

import java.util.Arrays;

public class 순열_03_방문체크 {
	static int[] nums = {1,2,3};
	static int N  = 3;
	static int[] result = new int[N];
	static boolean[] visited = new boolean[N];

	//원본을 수정하여 순열을 생성하므로 추가 메모리 공간이 필요가 없음!
	public static void main(String[] args) {
		perm(0);
	}

	//idx : result의 인덱스
	static void perm(int idx) {
		//기저조건
		if(idx == N) {
			System.out.println(Arrays.toString(result));
			return;
		}
		
		//재귀파트
		for(int i=0; i<N; i++) {
			//1. i번째 원소를 사용한 경우..
			if(visited[i]) continue;
			//해당 부분이 실행이 된다는 것은... i번쨰 요소를 사용하지 않았다는 뜻
			result[idx] = nums[i];
			visited[i] = true;
			perm(idx+1);
			visited[i] = false;	//원상복구
			result[idx] = -1;	//이거 필요한가?
			
			
			//2. i번째 원소를 사용하지 않은 경우..
//			if(!visited[i]) {
//				//코드를 작성하면 된다.
//				
//			}
			
		}
		
		
		
	}
}
