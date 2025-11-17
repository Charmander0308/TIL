package 조합;

import java.util.ArrayList;

public class 조합04_중복조합 {
	static String[] material;
	static int N, R;	//N: 전체 재료의 수, R: 넣을 재료의 수
//	static List<String> sel;	//이 버전도 가능
	public static void main(String[] args) {
		N = 4;
		R = 2;
		material = new String[] {"상추", "패티", "토마토", "치즈"};
		///////////위는 직접 입력을 받아야하나... 로직에 집중하기 위해 그냥 넣었음
		
		combcomb(0, new ArrayList<String>());
		
	}//main

	//idx: 현재 판단할 재료
	//sel: 뽑은 재료들
	public static void combcomb(int idx, ArrayList<String> sel) {
		if(sel.size() == R) {
			System.out.println(sel);
			return;
		}
		
		//재귀파트
		for(int i=idx; i<N; i++) {
			sel.add(material[i]);	//재료 넣고
			combcomb(i, sel);	//내려보내서 판단하고
			sel.remove(sel.size()-1);	//넣은 재료 다시 빼버리기
		}
		
	}
	
}
