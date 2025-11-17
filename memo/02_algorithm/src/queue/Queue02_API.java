package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue02_API {
	public static void main(String[] args) {
		//Queue는 인터페이스!
		//따라서 구현체로 자주 사용하는거 2가지 있음
		//1. LinkedList
		//2. ArrayDeque
		Queue<String> q = new LinkedList<>();
		
		//추가
//		q.add("김태희");		//사이즈 넘기면 예외
//		q.offer("박지우");	//넘겨도 예외 x
		
		//삭제
//		q.remove();	//아무것도 없을 때 꺼내면 예외 발생
//		q.poll();	//아무것도 없을 때 꺼내도 예외 x -> 출력하면 null
		
		//조회
		q.element();	//아무것도 없을 때 조회하면 예외 발생
		q.peek();		//아무것도 없을 때 조회해도 예외 x -> 출력하면 null
		
		//add, remove, element : 예외를 발생시키는 조합
		//offer, poll, peek : 값을 반환하는 조합
		
	}

}
