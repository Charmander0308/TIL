
public class String04_패턴매칭_브루트포스 {
	public static void main(String[] args) {
		String text = "This iss a book";
		String pattern = "iss";

	}

	// 찾는 순간 해당 위치의 인덱스를 반환 (없으면 -1을 반환하겠다)
	public static int matchingFor(String t, String p) {

		// 길이를 뽑아내자
		int N = t.length();
		int M = p.length();

		for (int i = 0; i < N - M + 1; i++) {
			boolean isOk = true;
			for (int j = 0; j < M; j++) {
				if (t.charAt(i + j) != p.charAt(j)) {
					isOk = false;
					break;
				}
			} // 패턴 검사 하즈아~~
			if (isOk) {
				// 찾았는데?
				return i;
			}
		} // 시작점을 위한 for문인데 경계를 잘 확인하즈아

		return -1;

	}
}
