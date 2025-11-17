import java.util.Arrays;

public class 분할정복_02_이진검색 {
	static int[] arr = { 2, 6, 19, 20, 55, 77, 100 };
	static int key = 10;

	public static void main(String[] args) {
//		Arrays.binarySearch(null, 0);
	}

	// 찾았다/못찾았다!
	static boolean binarySearch1(int left, int right) {
		// 반복문을 이용해서 짜는것 이미 기본과정에서 다루었으니 생략
		left = 0;
		right = arr.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;

			if (arr[mid] == key)
				return true;
			else if (arr[mid] > key)
				right = mid - 1;
			else
				left = mid + 1;
		}

		return false;
	}

	static boolean binarySearch2(int left, int right) {
		// 종료조건
		if (left > right)
			return false;

		// 재귀파트
		int mid = (left + right) / 2; // 내림처리 int형이니까...
		// 1. 같을 때
		if (arr[mid] == key)
			return true;
		// 2. 작을 때(중간 값보다 키값이) -> 왼쪽 절반
		else if (arr[mid] > key)
			return binarySearch2(left, mid - 1);
		// 3. 클 때(중간 값보다 키값이) -> 오른쪽 절반
		else
			return binarySearch2(mid + 1, right);

	}
}
