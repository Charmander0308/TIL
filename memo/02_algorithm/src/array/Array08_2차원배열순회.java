package array;

public class Array08_2차원배열순회 {
	public static void main(String[] args) {
		//문제- 행/열의 크기가 주어지고 다음 줄부터 입력이 주어진다.
//		2 4
//		1 2 3 4
//		5 6 7 8
		
		int[][]arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 1, 2, 3}};
		
		//행 우선순회 방식(정방향)
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		//행 우선순회 방식(역방향)
		//1. for문 조건 건드리는 방식
		
		//2. Index를 건드리는 방식
		
		
		
		//열 우선순회 (정방향) -> N x M 이라는 가정하에 조건식 저렇게 가능,,(가변길이 배열이면 고정은 위험해..)
		for(int j = 0; j < arr[0].length; j++) {
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		//열 우선순회 방식(역방향)
		//1. for문 조건 건드리는 방식
		
		//2. Index를 건드리는 방식
		
		
		
		
		//지그재그 순회
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
			} else if(i % 2 != 0) {
				for(int j = arr[i].length-1; j >= 0; j--) {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
		
		//고급버전
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j+(arr[i].length-1-2*j)*(i % 2)] + " ");
			}
			System.out.println();
		}
		
		
		
		//달팽이순회
		
		
		
		
	}

}
