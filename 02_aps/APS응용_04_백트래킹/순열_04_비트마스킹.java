import java.util.Arrays;

public class 순열_04_비트마스킹 {
//	static int[] nums = { 1, 2, 3 };
	static int[] nums = { 1, 1, 2 };
	static int N = 3;
	static int[] result = new int[N];

	public static void main(String[] args) {
		perm(0, 0);
	}

	// idx : result의 인덱스
	// visited : 해당 원소를 사용했는지 비트를 통한 쳌
	static void perm(int idx, int visited) {
		// 기저조건
		// 비트가 N개의 원소만큼 가득 차 있으면
//		if(visited == (1<<N)-1) {}
		if (idx == N) {
			System.out.println(Arrays.toString(result));
			return;
		}

		// 재귀파트
		for (int i = 0; i < N; i++) {
			// i번째 원소를 사용했는지 쳌
			// 해당 원소를 사용했다면 넘어가~~
			if ((visited & (1 << i)) != 0)
				continue;

			// 비트 찔러넣고
			result[idx] = nums[i];
			// 호출 부에서 비트를 찔러 넣자! -> 원상복구 할 필요 없음 :)
			perm(idx + 1, visited | (1 << i));
			// 비트 빼버리고

		}

	}
}
