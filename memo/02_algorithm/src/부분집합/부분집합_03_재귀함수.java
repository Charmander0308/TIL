package 부분집합;

public class 부분집합_03_재귀함수 {
	static int N = 3;
	static boolean[] sel = new boolean[N];	//재료가 있다 없다!
	static String[] material = {"단무지", "햄", "오이"};
	
	public static void main(String[] args) {
		powerset(0);
	}
	//N : 재료의 수
	//idx : 현재 넣을래 말래? 를 판단하는 재료
	public static void powerset(int idx) {
		//종료파트(모든 재료 판단 끝)
		if(idx == N) {
			for(int i=0; i<N; i++) {
				if(sel[i]) {
					System.out.print(material[i]);
				}
			}
			System.out.println();
			return;
		} 
		
		//재귀파트
		sel[idx] = true; //이번 재료 넣어라!
		powerset(idx+1);	//다음 재료 판단 gogo
		
		sel[idx] = false; //이번 재료 넣지마!
		powerset(idx+1);	//다음 재료 판단 gogo
		
	}
}
