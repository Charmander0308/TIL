package 이중연결리스트;

public class DoublyLinkedList {
	Node head; // 가장 첫번째 노드를 가리키는 필드
	Node tail; // 가장 마지막 노드를 가리키는 필드
	int size;

	// 기본생성자를 만들피룡는 없다. null null 0

	// 조회
	public Node get(int idx) {
		if (idx < 0 || idx >= size) {
			System.out.println("서울15반전태섭 : 그런거 왜 넣어!");
			return null;
		}
		// 지역변수
		Node curr;
		// 찾아와!
		if (idx < size / 2) {
			curr = head;
			for (int i = 0; i < idx; i++) {
				curr = curr.next;
			}
		} else {
			curr = tail;
			for (int i = size - 1; i > idx; i--) {
				curr = curr.prev;
			}
		}
		return curr;
	}

	// 삽입
	public void addFirst(String data) {
		// 1. 노드를 생성하겠다.
		Node node = new Node(data);

		node.next = head; // head가 null이어도 아니어도 상관없음
		// head 공백이 아니라면.....
		if (head != null) {
			head.prev = node;
		}
		head = node;
		size++;

		// 노드가 한개야!
//		if(size == 1)
		if (head.next == null)
			tail = head;
	}

	// 마지막 위치 삽입하자
	public void addLast(String data) {
		if (size == 0) {
			addFirst(data);
			return;
		}
		Node node = new Node(data);

		tail.next = node;
		node.prev = tail;
		tail = node;
		size++;
	}

	// 중간 위치 삽입
	public void add(int idx, String data) {
		if (idx < 0 || idx > size)
			return; // 웁스 그런 범위는 노노
		if (idx == 0) {
			addFirst(data);
			return;
		}
		if (idx == size) {
			addLast(data);
			return;
		}
		///////////////////////////////////////////////
		Node prevNode = get(idx - 1);
		Node nextNode = prevNode.next;
		Node node = new Node(data);
		// 이전노드와 새로만든 노드 연결
		prevNode.next = node;
		node.prev = prevNode;

		// 이후노드와 새로만든 노드 연결
		node.next = nextNode;
		nextNode.prev = node;

		size++;

	}

	
	//첫번째 위치 삭제
	public String remove() {
		if(head == null) //size == 0
			return null;
		
		String data = head.data;
		
		head = head.next;
		if(head != null)
			head.prev = null;
		size--;
		
		//tail 한개 원소를 잡고 있어서...
		if(size == 0)
			tail = null;
		
		return data;
	}
	
	//중간 노드 삭제
	public String remove(int idx) {
		if(idx < 0 || idx >= size) return null;
		if(idx == 0) return remove();
		
		Node prevNode = get(idx-1);
		Node rmNode = prevNode.next;
//		Node nextNode = rmNode.next;
		Node nextNode = prevNode.next.next;
		
		
		String data = rmNode.data;
		
		if(nextNode != null) {
			nextNode.prev = prevNode;
			prevNode.next = nextNode;
		}else {
			//마지막 노드였다.(tail 이었어!)
			prevNode.next = null;
			tail = prevNode;
		}
		size--;
		
//		return rmNode.data;
		return data;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 출력
	public void printList() {
		Node curr = head;
		if (head == null) {
			System.out.println("공백");
			return;
		}
		while (curr != null) {
			System.out.print(curr.data + " -> ");
			curr = curr.next;
		}
		System.out.println();
	}

}
