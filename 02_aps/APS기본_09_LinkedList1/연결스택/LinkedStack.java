package 연결스택;

public class LinkedStack {
	Node top; //포인터 변수가 필요해! 1개면 충분(head의 역할)
	
	//공백 상태
	public boolean isEmpty() {
		return top == null;
	}
	
	//포화 상태 (연결스택에서는 작성하지 않음)
	
	//조회(확인)
	public Integer peek() {
		if(top == null) return null;
		return top.data;
	}
	
	////////////////////////////////////////////////
	//push (삽입)
	public void push(int data) {
		//1. 노드생성
		Node node = new Node(data);
		//2. 생성한 노드의 링크는 top으로 넣는다.
		node.link = top;
		//3. top을 옮긴다.
		top = node;
	}
	
	//pop (삭제)
	public Integer pop() {
		if(isEmpty()) return null;
		
		int data = top.data;	//데이터 꺼내고
		top = top.link;			//탑 옮기고
		return data;			//데이터 반환하고
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
