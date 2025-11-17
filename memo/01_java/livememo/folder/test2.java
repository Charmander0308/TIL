package folder;

public class test2 {
	public static void main(String[] args) {
		changeBinary(111);
	}
	public static void changeBinary(int num) {
		//종료
		if(num==1) {
			System.out.print(num);
			return;
		}
		//재귀
		changeBinary(num / 2);
		System.out.print(num % 2);
	}
}
