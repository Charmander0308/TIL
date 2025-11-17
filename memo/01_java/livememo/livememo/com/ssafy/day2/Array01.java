package livememo.com.ssafy.day2;
import java.util.Arrays;

public class Array01 {
	public static void main(String[] args) {
		int[] array = new int[] {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(array));
		System.out.println(array[0]);
//		System.out.println(array[6]);
		System.out.println(array.length);
		String name = "김수한무거북이와두루미";
		System.out.println(name.length());
		
		for(int i : array) {
			System.out.println("순회문" + i);
		}
		
		int[] shallow = array;
		System.out.print("shallow = ");
		for(int i : shallow) {
			System.out.print(i);
		}
		System.out.println();
		
		int[] deep = Arrays.copyOf(array, array.length);
		deep[1] = 10;
		System.out.println("원본배열(array) = " + Arrays.toString(array));
		System.out.println("복사본배열(deep) = " + Arrays.toString(deep));
		
		
		//2차원 배열
		int[][] arr1 = new int[2][3];
		
		for(int[] a : arr1) {
			System.out.println(Arrays.toString(a));
		}
		
		System.out.println(Arrays.deepToString(arr1));
		
		//배열 개수만 지정하고 크기 지정 안해도 돌아감
		int[][] arr2 = new int[5][];
		System.out.println(Arrays.deepToString(arr2));

		arr2[0] = new int[]{1, 2, 3};
		System.out.println(Arrays.deepToString(arr2));
		
		//할당되지 않은 주소는 null
		System.out.println("arr2[0] = " + arr2[0]);
		System.out.println("arr2[1] = " + arr2[1]);
		
		//크기가 0인 배열도 가능
		int[]arr3 = new int[0];
		System.out.println(arr3);
		System.out.println(Arrays.toString(arr3));
		
	}

}
