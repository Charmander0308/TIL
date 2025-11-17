
public class Stack02_Array구현 {
	// 배열을 이용한 구현 -> 고민포인트(배열의 크기) -> 10만~100만
	static String[] stack = new String[10];
	static int top = -1; // -1은 인덱스 밖! 공백상태군!

	public static void main(String[] args) {
		//테스트 마구잡이로 해볼거엇!
	}

	// push
	static boolean push(String item) {
		// 배열이므로... 가득 차 있는지 쳌 필요
//		if(top == stack.length-1) {
		if (isFull()) {
			// 가득차있으므로... 작업이 진행될 수 없어..
			// stack의 크기를 2배로 늘려서 복사를 해두던가....
			// 못한다고 쳐내자!
			System.out.println("가득 찼다... 배불러");
			return false;
		}
		//top 을 하나 증가시키고 -> item을 삽입하겠다.
//		top += 1;
//		stack[top] = item;
		//위의 두줄을 한줄로 바꾼것!
		stack[++top] = item;
		// 냅다 집어넣기...

		return true;
	}
	
	// pop
	static String pop() {
		//배열이 아니더라도... 이 연산은 해봐야된다.
		if(isEmpty()) {
			//공백상태이므로 어떤 작업을 진행해라!
			System.out.println("뺄 거 없다..");
			return null;
		}
		//꺼내자
//		String result = stack[top];
//		top -= 1;
//		return result;
		
		return stack[top--];
	}
	// peek
	static String peek() {
		//배열이 아니더라도... 이 연산은 해봐야된다.
		if(isEmpty()) {
			//공백상태이므로 어떤 작업을 진행해라!
			System.out.println("뺄 거 없다..");
			return null;
		}
		
		return stack[top];
	}
	
	
	
	
	static boolean isEmpty() {
		return top == -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	// isFull() :포화상태 쳌
//	static boolean isFull() {
//		if (top == stack.length - 1)
//			return true;
//		else
//			return false;
//	}
	// else 싫어요
//	static boolean isFull() {
//		if (top == stack.length - 1)
//			return true;
//		return false;
//	}
	static boolean isFull() {
		return top == stack.length - 1;
	}

}
