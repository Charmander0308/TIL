package 조합;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 조합03_재귀함수_반복문 {
	static String[] material;
	static String[] sel;	//뽑은거 저장(boolean배열로 할 수도 있지만 굳이..?)
	static int N, R;	//N: 전체 재료의 수, R: 넣을 재료의 수
	static List<String[]> result;
	public static void main(String[] args) {
		N = 4;
		R = 3;
		material = new String[] {"상추", "패티", "토마토", "치즈"};
		sel = new String[R];
		result = new ArrayList<>();
		///////////위는 직접 입력을 받아야하나... 로직에 집중하기 위해 그냥 넣었음
		
		combination(0, 0);
//		System.out.println("====");
//		for(String[] str : result)
//			System.out.println(Arrays.toString(str));
//		
	}//main
	public static void combination(int idx, int sidx) {
		//종료파트
		if(sidx == R) {
			System.out.println(Arrays.toString(sel));
			result.add(sel);	
			//전부 같은 값을 넣고 있는거야!
//			System.out.println("--------");
//			for(String[] str : result)
//				System.out.println(Arrays.toString(str));
//			//깊은 복사를 해서 넣어야한다.
//			String[] tmp = new String[R];
//			for(int i=0; i<R; i++) {
//				tmp[i] = sel[i];
//			}
//			result.add(tmp);
			
			return;
		}
		//재귀파트
		//반복문을 통해 내가 할 수 있는 범위 만큼만 돌릴거야!
		for(int i=idx; i<=N-R+sidx; i++) {
			sel[sidx] = material[i];
			combination(i+1, sidx+1);
		}
	}
}
