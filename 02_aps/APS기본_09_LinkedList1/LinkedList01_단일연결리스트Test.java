import 단일연결리스트.SinglyLinkedList;

public class LinkedList01_단일연결리스트Test {
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.addFirst("최현진");
		list.printList();
		list.addFirst("유승준");
		list.printList();
		list.addLast("안태리");
		list.printList();
		list.add(1, "이지원");
		list.printList();
		
		list.removeFirst();
		list.printList();
		
	}
}
