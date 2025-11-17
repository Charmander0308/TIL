package folder;

public class test1 {
	public static void main(String[] args) {
		System.out.println(5&3);	//0001
		System.out.println(5|3);	//0111
		System.out.println(5^3); 	//0110
		System.out.println(~5);
		System.out.println(5<<1);	//0101 -> 1010 (1만큼 비트를 왼쪽으로 이동시키고 오른쪽에 0을 채움)
		System.out.println(5>>1); 	//0101 -> 0010 (1만큼 비트를 오른쪽으로 이동시키고 왼쪽에 부호비트를 채움)
		System.out.println(5>>>1); 	//0101 -> 0010 (1만큼 비트를 오른쪽으로 이동시키고 왼쪽에 0을 채움)
			
	}
}
