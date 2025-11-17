package sort;

import java.util.Arrays;

public class 선택정렬 {
	public static void main(String[] args) {

		int[] arr = { 32, 55, 27, 94, 75, 69 };
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIdx = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIdx] > arr[j]) {
					minIdx = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = tmp;
		}
	}
}
