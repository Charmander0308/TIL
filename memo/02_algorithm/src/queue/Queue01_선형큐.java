package queue;

public class Queue01_선형큐 {
	//배열아님... 큐라고 생각하자~~(크기 결정은 문제를 보고 판단하자)
	public static int[] queue = new int[10];
	public static int front = -1;	//데이터를 삭제하는 위치
	public static int rear = -1;	//데이터를 삽입하는 위치
//	public static int head = -1, tail = -1;		//자료형이 같으면 이렇게도 선언 가능
	
	
	public static void main(String[] args) {
		enQueue(10);
		enQueue(20);
		enQueue(30);
		while(!isEmpty())
			System.out.println(deQueue());
		
	}
	
	//큐를 초기화하는 메서드 (실제론 잘 안만드는 것 같다...only 교육용)
	public void createQueue(int size) {
		queue = new int[size];
		front = -1;
		rear = -1;
	}
	
	//포화 check(배열이라서 하는..)
	public static boolean isFull() {
		return rear == queue.length-1;
	}
	
	//공백 check
	public static boolean isEmpty() {
		return front == rear;
	}
	
	//삽입
	public static void enQueue(int item) {
		//포화체크
		if(isFull()) {
			System.out.println("가득 차 있어서 넣지 못해요~");
		} else {
			//넣자!
//			rear++;
//			queue[rear] = item;
			queue[++rear] = item;
		}
	}
	
	//삭제(반환 타입은 큐에 넣고 빼는 타입과 동일하다!)
	public static int deQueue() {
		//공백검사!
		if(isEmpty()) {
			System.out.println("꺼낼 값이 없어요~");
			return -1;	//-1이라는 값이 내가 사용할 수 있는 값일지도? -> 문제에서 정한 범위 밖의 값을 사용하자! or 배열을 Integer로 선언하고 null을 반환하기
		}
		return queue[++front];	//실제로 데이터를 지운 것은 아니다!
	}
}
