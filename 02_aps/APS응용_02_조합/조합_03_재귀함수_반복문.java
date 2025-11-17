import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 조합_03_재귀함수_반복문 {
	static String[] 재료;
	static String[] sel;  //뽑은거 저장 (boolean 배열로 할수도 있지만 굳이...)
	static int N, R; // N : 전체 재료의수, R : 넣을 재료의 수
	static List<String[]> result;
	public static void main(String[] args) {
		N = 4;
		R = 3;
		재료 = new String[] {"상추", "패티", "토마토", "치즈"};
		sel = new String[R];
		result = new ArrayList<>();
		///////////////////////////위는 입력을 직접 받아야하나... 로직에 집중 위해 그냥 넣었음
		
		combination(0, 0);
		//결과를 전부 모아서 여기서 작업해야지 또는 여기에서 최대값 뽑아야지...
//		System.out.println("---------------------");
//		for(String[] str : result) {
//			System.out.println(Arrays.toString(str));
//		}
//		
		
	}//main
	public static void combination(int idx, int sidx) {
		//종료파트
		if(sidx == R) {
			System.out.println(Arrays.toString(sel));
			//특정한 작업을 진행한다 뽑은걸 가지고 작업을 할꺼야!
//			전부 같은 값을 넣고 있는거야!
//			result.add(sel);
//			System.out.println("---------------------");
//			for(String[] str : result) {
//				System.out.println(Arrays.toString(str));
//			}
			//깊은 복사를 해서 넣어야 한다.
//			String[] tmp = new String[R];
//			for(int i = 0 ; i<R; i++) {
//				tmp[i] = sel[i];
//			}
//			result.add(tmp);
			
			return;
		}
		//재귀파트
		//반복문을 통해 내가 할 수 있는 범위 만큼만 돌릴거야!
		for(int i = idx; i<=N-R+sidx; i++ ) {
			sel[sidx] = 재료[i];
			combination(i+1, sidx+1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
