import java.util.Arrays;

public class Array06_2차원배열_선언및생성 {
	public static void main(String[] args) {
		//선언!
		int[][] arr1;
		int[] arr2[];
		int arr3[][];
		
		//초기화
		
		int[][] arr4 = new int[2][3]; //행:2, 열:3
//		System.out.println(Arrays.toString(arr4[0]));
//		System.out.println(arr4[0][0]);
		
		//2차원 배열 출력!
		for(int i = 0 ; i<arr4.length; i++) {
			for(int j = 0; j<arr4[i].length; j++) {
				System.out.print(arr4[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------");
		for(int[] a: arr4) {
			System.out.println(Arrays.toString(a));
		}
		System.out.println("--------------------");
		System.out.println(Arrays.deepToString(arr4));
		
		
		////////////////////////////////////////////////
		//1차원 배열의 개수만 지정하고, 크기를 지정하지 않을 수 있다!
		int[][] arr5 = new int[5][];
		System.out.println(Arrays.deepToString(arr5));
		
		arr5[0] = new int[] {1,2,3};
		System.out.println(Arrays.deepToString(arr5));
		
		int[][] arr6 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(Arrays.deepToString(arr6));
		
		
		int[] arr7 = new int[0]; //가능할까? 안할까?
		System.out.println(arr7.length);
		
		
		
		
		
		
		
		
		
		
		
	}
}
