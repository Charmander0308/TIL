import java.util.Arrays;

public class Array03_배열의순회 {
	public static void main(String[] args) {
		int[] intArray = {1, 3, 5, 7, 9};
		
		for(int i = 0; i<intArray.length; i++) {
//			System.out.println(intArray[i]);
		}
		
		//for-each
		//for(요소 : 반복할 것)
		
		//read only
		for(int x : intArray) {
//			System.out.println(x*2);
//			x = x * 2;
			x *= 2;
		}
		
		System.out.println(Arrays.toString(intArray));
	}
}
