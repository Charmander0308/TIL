import java.util.Arrays;

public class Array04_1_얕은복사 {
	public static void main(String[] args) {
		int[] original = { 1, 2, 3 };
		int[] shallowCopy = original; // 얕은 복사 (참조 공유)

		shallowCopy[0] = 10;

		System.out.println("원본 배열: " + Arrays.toString(original)); // [10, 2, 3]
		System.out.println("복사본 배열: " + Arrays.toString(shallowCopy)); // [10, 2, 3]
	}
}
