package livememo.com.ssafy.day7.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>();
		
		deque.addLast("양띵균");
		deque.addFirst("김싸피");
		deque.addFirst("박싸피");
		
		System.out.println(deque);
	}

}
