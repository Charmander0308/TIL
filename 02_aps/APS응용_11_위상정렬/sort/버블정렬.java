package sort;

import java.util.Arrays;

public class 버블정렬 {
	public static void main(String[] args) {
		int[] arr = { 32, 17, 83, 54, 49, 22 };

		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - 1 - j; i++) {
				if (arr[i] > arr[i + 1]) {
					int tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
