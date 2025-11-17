package stack;

import java.util.Stack;

public class Stack01_API {
	public static void main(String[] args) {
		//숫자를 담을 수 있는 stack이 완성!
		Stack<Integer> stack = new Stack<>();
		//문자는?
//		Stack<String>
		
		//주요 메서드
		//1. push(item) -> 참조자료형은 Integer
		int result = stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println(result);
//		System.out.println(stack);
		
		System.out.println("----");
		
		//2. pop
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
//		System.out.println(stack.pop());	//더 이상 없는데 어떻게 꺼내니 -> 예외발생
		
		System.out.println("----");
		
		//무작정 빼면 안되겠군
		//3. isEmpty()
		System.out.println(stack.isEmpty());
		//안에 있는거 전부 빼라
		stack.clear();	//스택을 초기화 해버리는 것
		//조건을 확인해보자
		while(!stack.isEmpty()) {
			stack.pop();
		}
		while(stack.size() > 0) {
			stack.pop();
		}
		System.out.println(stack.size());
		
		System.out.println("----");

		//4. peek()
		stack.push(100);
		stack.push(200);
		System.out.println(stack.peek());
		System.out.println(stack.size());
		
		
	}

}
