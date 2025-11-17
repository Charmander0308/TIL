//class MyQueue<T> {
//	
//}

public class Queue01_선형큐 {
	// 배열 X -> 큐야 큐 자기암시 필수!(크기 결정은 문제를 보고 판단하자)
	public static int[] queue = new int[10];
	public static int front = -1; // 데이터 삭제 위치
	public static int rear = -1; // 데이터 삽입 위치
//	public static int head = -1, tail = -1;

	public static void main(String[] args) {
		enQueue(10);
		enQueue(20);
		enQueue(30);
		enQueue(30);
		enQueue(30);
		
		while(!isEmpty())
			System.out.println(deQueue());
		
		
		System.out.println(deQueue());
	}

	// 공백 쳌
	public static boolean isEmpty() {
		return front == rear;
	}

	// 포화 쳌(배열이라서...)
	public static boolean isFull() {
		return rear == queue.length - 1;
	}

	// 삽입
	public static void enQueue(int item) {
		// 포화쳌
		if (isFull()) {
			System.out.println("가득 차 있어서... 넣지를 못해~~");
		} else {
			// 넣자!
//			rear++;
//			queue[rear] = item;
			queue[++rear] = item;
		}
	}

	// 삭제(반환 타입은 큐에 넣고 빼는 타입과 동일하다!)
	public static int deQueue() {
		// 공백검사!
		if (isEmpty()) {
			System.out.println("꺼낼 값이 없어요 ㅠ^ㅠ");
			return -1; // -1이라는 값이 내가 사용할 수 있는 값일지도?
		}
		return queue[++front]; // 실제로 데이터를 지운것은 아니다!
	}

	// 큐를 초기화 하는 메서드(잘 안만드는것 같다..)
	public void createQueue(int size) {
		queue = new int[size];
		front = -1;
		rear = -1;
	}
}
