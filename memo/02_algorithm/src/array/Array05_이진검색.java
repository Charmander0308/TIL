package array;

import java.util.Arrays;

//이진검색은 정렬이 필수!!!
public class Array05_이진검색 {	//1000개 배열에서 순차검색은 1000회, 이진검색은 10회면 탐색 가능
	public static void main(String[] args) {
		int[] arr = new int[]{93, 13, 45 ,3, 2, 7, 49, 65, 8, 14, 22};
		Arrays.sort(arr);
	}
	
	public static int binarySearch(int[]arr, int key) {
		//범위를 컨트롤하는 변수 2개
		int L = 0;
		int R = arr.length-1;
		
		while(L <= R) {
			int mid = (L+R) / 2;	//정수로 반환, 소수점 나머지는 버림
			if(arr[mid] == key) {
				return mid;
			} else if(arr[mid] > key) {
				//찾고자 하는 값이 중앙값보다 작으면 R을 움직임
				R = mid - 1;
			} else {
				//찾고자 하는 값이 중앙값보다 크면 L을 움직임
				L = mid + 1;
			}
		}
		return -1;
	}
}
