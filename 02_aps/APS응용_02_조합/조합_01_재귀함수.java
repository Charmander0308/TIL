import java.util.Arrays;

public class 조합_01_재귀함수 {
	static String[] 재료;
	static String[] sel;  //뽑은거 저장 (boolean 배열로 할수도 있지만 굳이...)
	static int N, R; // N : 전체 재료의수, R : 넣을 재료의 수
	public static void main(String[] args) {
		N = 4;
		R = 3;
		재료 = new String[] {"상추", "패티", "토마토", "치즈"};
		sel = new String[R];
		///////////////////////////위는 입력을 직접 받아야하나... 로직에 집중 위해 그냥 넣었음
		
		combination(0, 0);
		
		
	}//main
	
	//idx : 이번에 고려할 재료의 인덱스
	//sidx : 뽑은 재료의 인덱스
	public static void combination(int idx, int sidx) {
		//종료파트
		if(sidx == R) {
			//필요한 로직 작업을 수행
			System.out.println(Arrays.toString(sel));
			return;
		}
		if(idx >= N) {
			//더이상 고려할 재료가 없다!
			return;
		}
		
		//재귀파트
		//현재 재료를 뽑은 경우
		sel[sidx] = 재료[idx];
		combination(idx+1, sidx+1);
		
		//현재 재료를 뽑지 않은 경우
//		sel[sidx] = null;				//덮어서 저장해버리므로 없어도 무방하다.
		combination(idx+1, sidx);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
