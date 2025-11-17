
public class Array05_Q1_최대최소합평균구하기 {
	public static void main(String[] args) {
		int[] nums = {64, 53, 123, 23, 444, 98, 12};
		
		// 반복문 &제어문을 적절히 활용하면 풀수있다.
		
		// 최소?
		// - 가장 첫번째 원소를 최소값이라고 가정한다.
		// - 두번째원소부터 시작해서 비교를해나가면서, 더 작은 원소를 발견하면 업데이트한다.
		
		int min = nums[0];
		for(int i=1; i < nums.length; i++)
			if(min > nums[i]) min = nums[i];
		
		// 최대?
		// - 가장 첫번째 원소를 최대값이라고 가정한다.
		// - 두번째원소부터 시작해서 비교를해나가면서, 더  원소를 발견하면 업데이트한다.
		int max = nums[0];
		for(int i=1; i<nums.length; i++)
			if(max < nums[i]) max = nums[i];
		
		// 합?
		// - 합을 저장할 변수를 하나만들고 0으로 초기화.
		// - 첫번째 원소부터 반복해서 순회하면서 각 원소를 더해나간다.
		int sum = 0;
		for(int i=0; i<nums.length; i++)
			sum += nums[i];
		
		// 평균?
		// - 합 / 배열의 길이
		// 저장은 double의 형태로, 출력은 printf  %.10f
		double avg = (double)sum / nums.length;
		
		System.out.println("최소: "+min);
		System.out.println("최대: "+max);
		System.out.println("합 : "+sum);
//		System.out.println("평균: "+avg);
		System.out.printf("평균: %.10f", avg);
		
		
	}
	/*
	 public static void main(String[] args) {
		int[] nums = {64, 53, 123, 23, 444, 98, 12};
		
		// 반복문 &제어문을 적절히 활용하면 풀수있다.
		
		// 최소?
		// - 가장 첫번째 원소를 최소값이라고 가정한다.
		// - 두번째원소부터 시작해서 비교를해나가면서, 더 작은 원소를 발견하면 업데이트한다.
		
		int min = nums[0];
		int max = nums[0];
		int sum = nums[0];
		for(int i=1; i < nums.length; i++) {
			if(min > nums[i]) min = nums[i];
			if(max < nums[i]) max = nums[i];
			sum += nums[i];
		}
		
		// 평균?
		// - 합 / 배열의 길이
		// 저장은 double의 형태로, 출력은 printf  %.10f
		double avg = (double)sum / nums.length;
		
		System.out.println("최소: "+min);
		System.out.println("최대: "+max);
		System.out.println("합 : "+sum);
//		System.out.println("평균: "+avg);
		System.out.printf("평균: %.10f", avg);
		
		
	}
	 */
}
