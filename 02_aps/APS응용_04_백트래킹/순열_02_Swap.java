import java.util.Arrays;

public class 순열_02_Swap {
	//원본을 수정하여 순열을 생성하므로... 
	//추가메모리공간이 필요 없다더라!
	static int[] nums = { 1, 2, 3};
	static int N = 3;

	public static void main(String[] args) {
		perm(0);
	}

	// idx : 현재 판단 위치
	static void perm(int idx) {
		if (idx == N) {
			System.out.println(Arrays.toString(nums));
			return;
		}

		// 재귀파트
		for (int i = idx; i < N; i++) {
			swap(i, idx);
			perm(idx + 1);
			swap(i, idx); // 원상복구
		}

	}

	// a, b : 인덱스!
	static void swap(int a, int b) {
		int tmp = nums[a];
		nums[a] = nums[b];
		nums[b] = tmp;
	}
}
