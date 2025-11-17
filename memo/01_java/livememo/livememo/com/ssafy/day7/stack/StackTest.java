package livememo.com.ssafy.day7.stack;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.add(10);	//백터, boolean반환
		stack.push(20);	//스택, 넣은 아이템(Integer) 반환
		stack.push(30);
		
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.peek();
		System.out.println(stack);
		System.out.println(stack.size());
		
		for(Integer i : stack) {
			System.out.println(i);
		}
		
		int num2 = stack.pop();
		System.out.println(stack.size());
		System.out.println(num2);
		
	}

}
