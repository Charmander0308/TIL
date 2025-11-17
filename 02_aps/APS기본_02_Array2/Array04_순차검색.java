import java.io.Serial;

public class Array04_순차검색 {
	public static void main(String[] args) {
		int[] arr = new int[] { 2, 3, 7, 8, 13, 14, 22, 45, 49, 65, 93 };
		System.out.println(searchWhileNoSort(arr, 10000));

	}

	// 반환타입 : 찾으면 해당 위치반환 / 없으면 -1을 반환
	public static int searchWhileNoSort(int[] arr, int key) {

		int i = 0;
		while (i < arr.length) {
			// 찾았으면 return 할꺼야!
			if (arr[i] == key) {
				return i;
			}
			i++;
		}

		return -1;
	}

	public static int searchForNoSort() {
		// 마음의 숙제
		return -1;
	}

	public static int searchForSort(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			// 이렇게 마무리를 지으면... 정렬X 있는 것도 차이가 없다.
			if (arr[i] == key) {
				return i;
			}
			// 서울17 박지우 아주빠름
			else if (arr[i] > key)
				return -1;

//			if(arr[i] == key) {
//				return i;
//			}
//			if(arr[i] > key) return -1;
		} // 전체를 정방향 순회하는 코드

		return -1;
	}

	public static int searchWhileSort() {
		// 마음의 숙제
		return -1;
	}
}
