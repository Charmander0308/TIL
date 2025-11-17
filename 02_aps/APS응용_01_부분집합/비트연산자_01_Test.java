
public class 비트연산자_01_Test {
	public static void main(String[] args) {
		// & 연산자 : 비트끼리 AND 연산 / 둘다 1일경우만 1을
		// | 연산자 : 비트끼리 OR 연산 / 하나라도 1일경우만 1을
		// ^ 연산자 : 비트끼리 XOR 연산 / 같으면 0 / 다르면 1을
		// ~ 연산자 : 단항연산자 / 비트반전 (1의보수를 취한것)
		// A << B : A비트를 B번 왼쪽으로 이동시킨다. 2씩 곱해짐
		// A >> B : A비트를 B번 오른쪽으로 이동시킨다. 2씩 나누어짐
		System.out.println(5&3);
		System.out.println(~5);
	}
}
