import java.util.Arrays;

public class 부분집합_01_반복문 {
	static int N = 4;
	static int[] sel = new int[N]; //재료가 있다! 없다!
	static String[] 재료 = {"단무지","햄","오이","계란"};
	public static void main(String[] args) {
		//반복문 부분집합을 만들껀데...
		//반복문의 개수는 몇개? 4개(재료의 수만큼)
		for(int i = 0 ; i<2; i++) {
			sel[0] = i;
			for(int j = 0; j<2; j++) {
				sel[1] = j;
				for(int k=0; k<=1; k++) {
					sel[2] = k;
					for(int l=0; l<=1; l++) {
						sel[3] = l;
						System.out.println(Arrays.toString(sel));
//						for(int a = 0; a<N; a++) {
//							if(sel[a] == 1)
//								System.out.print(재료[a]);
//						}
//						System.out.println(":김밥");
						
					}//
				}//
			}//
		}//
	}
}
