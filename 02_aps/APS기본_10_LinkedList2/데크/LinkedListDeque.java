package 데크;

//제네릭 하게 만들어보자
public class LinkedListDeque<T> {
	private class Node {
		T data;
		Node prev;
		Node next;

		Node(T data) {
			this.data = data;
		}
	}// Node 클래스 정의!

	private Node front;
	private Node rear;
	private int size;

	public boolean isEmpty() {
		// 무수히 많다.(작성법)
		return size == 0;
	}

	// 개수반환
	public int size() {
		return size;
	}

	// 맨앞에 원소 추가
	public void addFirst(T item) {
		Node node = new Node(item);
		// 공백인지 아닌지쳌
		if (isEmpty()) {
			front = rear = node;
		} else {
			node.next = front;
			front.prev = node;
			front = node;
		}
		size++;
	}

	// 맨뒤에 원소 추가
	public void addLast(T item) {
		Node node = new Node(item);
		if (isEmpty()) {
			front = rear = node;
			// 내부적으로 addFirst를 호출할수도 있음
		} else {
			rear.next = node;
			node.prev = rear;
			rear = node;
		}

		size++;

	}

	// 맨앞에 원소 삭제
	public T removeFirst() {
		if (isEmpty())
			return null;
		T data = front.data;
		if (size == 1)
			front = rear = null;
		else {
			front = front.next;
			front.prev = null;
		}
		size--;
		return data;
	}

	// 맨뒤에 원소 삭제
	public T removeLast() {
		if (isEmpty()) {
			return null;
		}

		T data = rear.data;
		if (size == 1)
			front = rear = null;
		else {
			rear = rear.prev;
			rear.next = null;
		}
		size--;
		return data;
	}

	public T peekFirst() {
		if (isEmpty())
			return null;
		return front.data;
	}

	public T peeLast() {
		if (isEmpty())
			return null;
		return rear.data;
	}

}
