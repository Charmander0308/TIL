package sort;

public class 힙정렬 {

	static int[] heap = new int[100];
	static int heapSize;

	public static void main(String[] args) {

		heapPush(18);
		heapPush(5);
		heapPush(14);
		heapPush(3);

		System.out.println(heapPop());
		System.out.println(heapPop());
		System.out.println(heapPop());
		System.out.println(heapPop());
	}

	static void swap(int a, int b) {
		int tmp = heap[a];
		heap[a] = heap[b];
		heap[b] = tmp;
	}

	static void heapPush(int data) {
		heap[++heapSize] = data;

		int ch = heapSize;
		int p = heapSize / 2;

		while (p > 0 && heap[p] < heap[ch]) {
			swap(p, ch);

			ch = p;
			p = ch / 2;
		}
	}

	static int heapPop() {
		int popItem = heap[1];
		heap[1] = heap[heapSize--];

		int p = 1;
		int ch = p * 2;

		if (ch + 1 <= heapSize && heap[ch] < heap[ch + 1]) {
			ch++;
		}

		while (ch <= heapSize && heap[p] < heap[ch]) {

			swap(p, ch);

			p = ch;
			ch = p * 2;
			if (ch + 1 <= heapSize && heap[ch] < heap[ch + 1]) {
				ch++;
			}

		}

		return popItem;
	}

}
