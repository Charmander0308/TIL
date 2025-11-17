import java.util.ArrayList;
import java.util.List;

public class 조합_04_중복조합 {
	static String[] 재료;
	static int N, R; // N : 전체 재료의수, R : 넣을 재료의 수
	static List<List<String>> result;
 	public static void main(String[] args) {
		N = 4;
		R = 2;
		재료 = new String[] { "상추", "패티", "토마토", "치즈" };
		result =  new ArrayList<>();
		
		combcomb(0, new ArrayList<String>());
		
		for(List<String> tmp : result) {
			System.out.println(tmp);
		}
		
	}// main

	
	
	//idx : 현재 판단할 재료
	//sel : 뽑은 재료들
	public static void combcomb(int idx, ArrayList<String> sel) {
		if(sel.size() == R) {
//			System.out.println(sel);
			
//			List<String> tmp = new ArrayList<>();
//			for(String str : sel) {
//				tmp.add(str);
//			}
//			
//			result.add(tmp);
			
			result.add(new ArrayList<>(sel));
			
			return;
		}
		
		//재귀파트
		for (int i = idx; i < N; i++) {
			sel.add(재료[i]);	//재료 넣고 
			combcomb(i, sel);	//내려 보내서 판단하고
			sel.remove(sel.size()-1); //넣은재료 다시 빼버리기
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
