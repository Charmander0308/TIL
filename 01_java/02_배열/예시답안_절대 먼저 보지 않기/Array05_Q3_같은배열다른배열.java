public class Array05_Q3_같은배열다른배열 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 1, 2, 3, 4, 5 };

		boolean isOk = true;

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				isOk = false;
				break;
			}
		}

		String[] arr3 = { "pig", "cow", "fish" };
		String[] arr4 = { "pig", "dog", "cat" };

		boolean isOk2 = true;

		for (int i = 0; i < arr3.length; i++) {
			if (!arr3[i].equals(arr4[i])) {
				isOk2 = false;
				break;
			}
		}
		
		System.out.println(isOk);
		System.out.println(isOk2);

	}
}
