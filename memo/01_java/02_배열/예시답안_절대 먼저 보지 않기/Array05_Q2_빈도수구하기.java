
import java.util.Arrays;

public class Array05_Q2_빈도수구하기 {
	public static void main(String[] args) {
		// 0부터 9까지의 숫자 불러주세요~~
		int[] arr = { 3, 7, 2, 5, 2, 5, 1, 2, 3, 4, 9};
		// 카운팅 배열의 정의: 
		int[] count = new int[10]; // 카운팅 배열 만들기
		// count[0]? 쓰지 않는다.
		// count[1] : 1의 개수
		// count[2] : 2의 갯수...
		// ...
		// count[9] : 9의 갯수..
		System.out.println(Arrays.toString(count));
		for(int i=0; i<arr.length; i++) {
			count[arr[i]]++;
		}
		
		for(int i =0; i<count.length; i++) {
			if(count[i] != 0) {
				System.out.println(i + " : " + count[i] + "번");
			}
		}
	}
}
