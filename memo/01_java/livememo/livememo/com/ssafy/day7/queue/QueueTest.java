package livememo.com.ssafy.day7.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		Queue<Integer> queue1 = new LinkedList<>();
		Queue<Integer> queue2 = new ArrayDeque<>();
		
		queue1.add(10);		//예외 발생
		queue1.offer(20);	//실패 반환
		
		System.out.println(queue1.poll());
		System.out.println(queue1.poll());
		System.out.println(queue1.poll());
		
		queue1.add(10);		//예외 발생
		queue1.offer(20);	//실패 반환
		
		System.out.println(queue1.remove());
		System.out.println(queue1.remove());
//		System.out.println(queue1.remove());	//java.util.NoSuchElementException
		
		System.out.println(queue1.isEmpty());
		System.out.println(queue1.size());
		
		
		
		
	} 
	

}
