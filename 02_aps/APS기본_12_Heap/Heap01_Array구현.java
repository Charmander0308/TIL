import java.util.Arrays;

//최대힙 구현!
public class Heap01_Array구현 {
	static int[] heap; // 정수형만 담을 수 있게 세팅 -> 문제에 따라 결정!
	static int heapSize;

	public static void main(String[] args) {
		// 최악의 경우를 대비해라 (하나도 빼는 것 없이 전부다 넣었을때를 가정하고)
		heap = new int[10]; // 문제를 보고 결정하면 된다! 9개 0번 X
		heapSize = 0;

		System.out.println(Arrays.toString(heap));
		heapPush(10);
		heapPush(20);
		heapPush(15);
		heapPush(30);
		System.out.println(Arrays.toString(heap));
		
		System.out.println(heapPop());
		System.out.println(Arrays.toString(heap));
		System.out.println(heapPop());
		System.out.println(Arrays.toString(heap));
		System.out.println(heapPop());
		System.out.println(heapPop());
		System.out.println(heapPop());

	}

	// int 형으로 결정을 한것은... int 배열로 만들어 두어서...
	// 힙의 자료형에 맞게 아이템의 자료형을 결정하자!
	public static void heapPush(int item) {
		// 마지막 자리에 아이템을 추가한다.
//		heapSize+=1;
//		heap[heapSize] = item;
		// 위의 두줄을 아래의 한줄로 바꾸었다.
		heap[++heapSize] = item;

		// 이제 올라갈 수 있으면 올라가~~
		int ch = heapSize;
		int p = ch / 2; // 버림처리....-> int형이라서 버려짐

		// 최대힙(최소힙으로 바꾸려면 아래의 부등호 방향을 바꾸자)
		while (p > 0 && heap[p] < heap[ch]) {
			// swap
			int tmp = heap[p];
			heap[p] = heap[ch];
			heap[ch] = tmp;

			// 올라가즈아 포인터 갱신
			ch = p;
			p = ch / 2;
		}
	}

	// 힙 삭제 연산
	public static Integer heapPop() {
		// 힙이 공백이라면...
		if (heapSize == 0)
			return null;

		int item = heap[1]; // 반환할 값 저장
		// 마지막 원소를 루트자리에 놓는다.
//		heap[1] = heap[heapSize];
//		heapSize -= 1;
		// 위의 두줄을 아래의 한줄로 처리
		heap[1] = heap[heapSize--];

		int p = 1;
		int ch = p * 2; // 왼자 세팅
		if (ch + 1 <= heapSize && heap[ch] < heap[ch + 1])
			ch += 1; // 오자로 다시 세팅
		
		//내려가즈아
		while(ch <= heapSize && heap[p] < heap[ch]) {
			//swap
			int tmp = heap[p];
			heap[p] = heap[ch];
			heap[ch] = tmp;
			
			//갱신
			p = ch; //왼자일수도 있고 오자일수도 있어요
			ch = p*2;
			if (ch + 1 <= heapSize && heap[ch] < heap[ch + 1])
				ch += 1; // 오자로 다시 세팅
		}
		
		return item;
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
