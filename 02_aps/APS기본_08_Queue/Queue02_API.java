import java.util.LinkedList;
import java.util.Queue;

public class Queue02_API {
	public static void main(String[] args) {
		//Queue 인터페이스!
		//따라서 구현체로 자주 사용하는거 2가지 있음
		//1. LinkedList
		//2. ArrayDeque
		Queue<String> q = new LinkedList<>();
		
//		q.add("김태희");
//		q.offer("박지우");
		
		//삭제
//		q.remove();
//		System.out.println(q.poll());
		
		//조회
//		q.element();
		System.out.println(q.peek());
		
		//add, remove, element : 예외를 발생시키는 조합
		//offer, poll, peek : 값을 반환하는 조합
		
		
	}
}
