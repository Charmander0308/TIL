
public class 분할정복_01_거듭제곱 {
	public static void main(String[] args) {

	}

	// C : 밑수
	// N : 지수
	static int pow1(int C, int N) {
		// 반복문을 이용해서 구해보자~~~
		// N번 수행!
		int tmp = 1;
		for (int i = 1; i <= N; i++) {
			tmp *= C;
		}
		return tmp;
	}

	// 재귀함수를 이용해서 구해보자~;
	static int pow2(int C, int N) {
		if (N == 0)
			return 1;
		return C * pow2(C, N - 1);
	}

	// 분할정복의 묘리를 이용해보즈아
	static int pow3(int C, int N) {
		if (N == 0)
			return 1;
		// 홀수일때, 짝수일때
//		if(N % 2 != 0) {
		if (N % 2 == 1) {
			return pow3(C, (N - 1) / 2) * pow3(C, (N - 1) / 2) * C;
		} else {
			return pow3(C, N / 2) * pow3(C, N / 2);
		}
	}

	// 위의 코드는 같은 값을 구하는 함수를 두번 호출한다.
	// 분할정복의 묘리를 이용해보즈아
	static int pow4(int C, int N) {
		if (N == 0)
			return 1;
		// 홀수일때, 짝수일때
		if (N % 2 == 1) {
			int tmp = pow4(C, (N - 1) / 2);
			return tmp * tmp * C;
		} else {
			int tmp = pow4(C, N/2);
			return tmp * tmp;
		}
	}
}
