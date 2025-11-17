package sort;

import java.util.Arrays;

public class 카운팅정렬 {

	public static void main(String[] args) {
		int[] arr = { 4, 9, 11, 23, 2, 19, 7 };

		int K = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > K) {
				K = arr[i];
			}
		}

		int[] count = new int[K + 1];

		for (int i = 0; i < arr.length; i++)
			count[arr[i]]++;

		for (int i = 1; i < count.length; i++)
			count[i] += count[i - 1];

		int[] sortedArr = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--)
			sortedArr[--count[arr[i]]] = arr[i];

		System.out.println(Arrays.toString(sortedArr));
	}

}
