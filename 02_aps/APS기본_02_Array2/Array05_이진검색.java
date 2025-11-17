import java.util.Arrays;


//정렬 필쑤!!!!
public class Array05_이진검색 {
	public static void main(String[] args) {
//		int[] arr = new int[] { 2, 3, 7, 8, 13, 14, 22, 45, 49, 65, 93 };
		int[] arr = new int[] { 2, 3, 7, 8, 13, 14};
		Arrays.sort(arr);
	}

	public static int binarySearch(int[] arr, int key) {
		// 범위를 컨트롤 하는 변수 2개
		int L = 0;
		int R = arr.length - 1;

		// 교차가되면 멈춘다!
		while (L <= R) {
			int mid = (L + R) / 2; // 소수점 나머지는 버려버린다.
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] > key) {
				// 찾고자하는 값이 중앙 값보다 작다면.... R을 움직여
				R = mid - 1;
			} else {
				// 반대의 경우는 L을 움직여...
				L = mid + 1;
			}
		}

		return -1;
	}
}
