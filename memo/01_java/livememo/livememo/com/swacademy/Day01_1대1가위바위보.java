package livememo.com.swacademy;

import java.util.Scanner;

public class Day01_1대1가위바위보 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 > ");
		int T = sc.nextInt();
		sc.nextLine();

		for (int test_case = 1; test_case <= T; test_case++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int result = a - b;
			if (result == 1 || result == -2) {
				System.out.print("A");
			} else {
				System.out.print("B");
			}
		}
	}

}
