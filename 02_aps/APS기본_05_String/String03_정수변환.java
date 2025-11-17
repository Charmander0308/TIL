
public class String03_정수변환 {
	public static void main(String[] args) {
		String strNum = "-12345A6";
		//문자열 -> 정수
//		int num = Integer.parseInt(strNum);
//		System.out.println(num);
		
		System.out.println(atoi(strNum));
		
		
	}
	
	//str은 아주 깔끔한 형태의 숫자만 들어온다. 예를 들어 "123456"
	//우리의 입맛대로 커스텀 가능 -> 정방향으로 처리를 했지만 <- 할때는 어떻게 하지?
	//음수라면 어떻게 하지?
	//실수라면 어떻게 하지?
	public static int atoi(String str) {
		int N = str.length();
		int num = 0; //반환
		
		// 		1 2 3 4 5 6  (인덱스 아님)
		for(int i = 0 ; i<N; i++) {
			char c = str.charAt(i); // '1', '2', '3', ....
			
			if( c >= '0' && c<= '9')
				num = (num*10) + (c-'0');
			
		}
		return num;
	}
	//정수 -> 문자열로 (마음의 숙제)
	public static String itoa(int num) {
		String strNum = num+"";
		
		return null;
	}
}
