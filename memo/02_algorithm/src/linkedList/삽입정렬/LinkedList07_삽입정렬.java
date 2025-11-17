package linkedList.삽입정렬;

import java.util.Arrays;

public class LinkedList07_삽입정렬 {
	public static void main(String[] args) {
		int[] data = {69, 10, 30, 2, 16, 17, 73, 4444};
		
		//삽입정렬한다.
		
		//1부터 하는 이유는 뭘까요? -> 0은 이미 정렬됨!
		for(int i = 1; i < data.length; i++) {
			int key = data[i];
			
			int j;
			for(j = i-1; j>=0 && key<data[j]; j--) {
				data[j+1] = data[j]; 
			}//뒤로 밀착
			data[j+1] = key; //자리에 넣어주기
		}
		System.out.println(Arrays.toString(data));
	}
}
