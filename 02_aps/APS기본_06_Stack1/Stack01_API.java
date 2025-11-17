import java.util.Stack;

public class Stack01_API {
	public static void main(String[] args) {
		
		// 숫자를 담을 수 있는 stack이 완성!
		Stack<Integer> stack = new Stack<>();
		// 문자를 담을 수 있는  stack
//		Stack<String>
		
		//주요 메서드
		//1. push(item)
		int result = stack.push(10); //반환 결과는 item이 반환된다.
		stack.push(20);
		stack.push(30);
		
		//2. pop()
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
//		System.out.println(stack.pop()); 없는걸 꺼내려고하면 예외발생
		
		//무작정 빼면 안될거같아.... 비어있니 쳌
		//3. isEmpty()
		System.out.println(stack.isEmpty());
		//안에 있는거 전부빼라
		stack.clear(); //-> 스택을 초기화 해버리는 것! ㅠ
		//조건을 확인해보자
		while(!stack.isEmpty()) {
			stack.pop();
		}
		while(stack.size() > 0) {
			stack.pop();
		}
		
		System.out.println(stack.size());
		
		//4. peek() 
		stack.push(100);
		stack.push(200);
		System.out.println(stack.peek());
		System.out.println(stack.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
