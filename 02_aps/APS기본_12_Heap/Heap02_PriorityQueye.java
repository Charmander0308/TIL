import java.util.PriorityQueue;

public class Heap02_PriorityQueye {
	public static void main(String[] args) {
		
		//컬렉션 프레임워크에서 사용할 수 있게 이미 구현이 되어있어 good
		//최소힙이군!(기본)
		//생성을 할때 비교기준을 넣어주면 최대힙도 가능하겠다!
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		//부호를 반대로 바꾸어서 넣자! 
		//부호를 반대로 바꾸는 방법은?
		int a = 10;
		a *= -1; 	//부호가 반대로 바뀐다. (더편하게...?)
		a = -a;		//- 기호를 단항 연산자로도 활용할 수 있다.
//		a = +a;		//+ 기호도 마찬가지로 단항 연산자로 활용할 수 있으나 의미는 없다.
		
		System.out.println(a);
		pq.add(-10);
		pq.add(-20);
		pq.add(-15);
		pq.add(-30);
		pq.add(-25);
		
		System.out.println(pq);
		//원상복구해야함 (부호를 바꾸었다면....)
//		System.out.println(-pq.poll());
		System.out.println(pq);
		//전부다 넣고, 전부다 빼버리면 정렬 끝
		while(!pq.isEmpty())
			System.out.println(-pq.poll());
	}
}
