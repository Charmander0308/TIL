import java.util.Arrays;

public class Array04_2_깊은복사 {
	public static void main(String[] args) {
		int[] original = { 1, 2, 3 };
		int[] deepCopy = new int[original.length];
		
		for(int i  = 0 ; i<original.length; i++) {
			deepCopy[i] = original[i];
		}
		deepCopy[0] = 10;

		System.out.println("원본 배열: " + Arrays.toString(original)); // [1, 2, 3]
		System.out.println("복사본 배열: " + Arrays.toString(deepCopy)); // [10, 2, 3]
	}
}
