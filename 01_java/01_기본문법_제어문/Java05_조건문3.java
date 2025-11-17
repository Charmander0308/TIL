//if-else if-else
public class Java05_조건문3 {
	public static void main(String[] args) {

		int score = 97;
		// 90점 이상 A
		// 80점 이상 90점 미만 B
		// 70점 이상 80점 미만 C
		// 그 외 F

		if (score >= 90) {
//			A
		} else {
			if (score >= 80) {
//				B
			} else {
				if (score >= 70) {
//					C
				} else {
//					F
				}
			}
		}

		if (score >= 90) {
//			A
		} else if (score >= 80) {
//				B
		} else if (score >= 70) {
//					C
		} else {
//					F
		}
	}
}
