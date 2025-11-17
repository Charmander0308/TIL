package string;

public class String04_패턴매칭_브루트포스 {
	public static void main(String[] args) {
		String text = "This iss a book";
		String pattern = "iss";
		
		System.out.println(matchingFor(text, pattern));
		
	}
	
	//찾는 순간 해당 위치의 인덱스를 반환(없으면 -1 반환)
	public static int matchingFor(String t, String p) {
		//길이를 뽑아내자
		int N = t.length();
		int M = p.length();
		
		for(int i = 0; i < N-M+1; i++) {
			boolean isOk = true;
			for(int j = 0; j < M; j++) {
				if(t.charAt(i+j) != p.charAt(j)) {
					isOk = false;
					break;
				}
			}
			if(isOk) {
				return i;
			}
			
		}//시작점을 위한 for문인데 경계를 잘 확인하자
		
		return -1;
	}

}
