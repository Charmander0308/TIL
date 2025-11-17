package livememo.com.ssafy.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsTest {
	public static void main(String[] args) {
		
		Set<Integer> hashSet = new HashSet<>();
		Set<Integer> treeSet = new TreeSet<>();
		
		List<Integer> linkedList = new LinkedList<>();
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> vector = new Vector<>(); 
		List<Integer> stack = new Stack<>();
		
		Queue<Integer> linkedListQueue = new LinkedList<>();
		Queue<Integer> priorityQueue = new PriorityQueue<>();
		Queue<Integer> arrayQueue = new ArrayDeque<>();
		
		Deque<Integer> arrayDeque = new ArrayDeque<>();
		
		Map<Integer, Object> hashMap = new HashMap<>();
		Map<Integer, Object> treeMap = new TreeMap<>();
		
		System.out.println("[ Set ]");
		
		long start = System.nanoTime();
		hashSet.add(1);
		hashSet.add(9);
		hashSet.add(3);
		hashSet.add(7);
		hashSet.add(5);
		long end = System.nanoTime();
		System.out.println("HashSet : " + hashSet + ", 작업시간 : " + (end - start));
		
		start = System.nanoTime();
		treeSet.add(1);
		treeSet.add(9);
		treeSet.add(3);
		treeSet.add(7);
		treeSet.add(5);
		end = System.nanoTime();
		System.out.println("TreeSet : " + treeSet + ", 작업시간 : " + (end - start));
		
		System.out.println("[ List ]");
		
		start = System.nanoTime();
		linkedList.add(1);
		linkedList.add(9);
		linkedList.add(3);
		linkedList.add(7);
		linkedList.add(5);
		end = System.nanoTime();
		System.out.println("LinkedList : " + linkedList + ", 작업시간 : " + (end - start));
		
//		start = System.nanoTime();
//		end = System.nanoTime();
//		System.out.println("LinkedList : " + linkedList + ", 작업시간 : " + (end - start));
		
		start = System.nanoTime();
		arrayList.add(1);
		arrayList.add(9);
		arrayList.add(3);
		arrayList.add(7);
		arrayList.add(5);
		end = System.nanoTime();
		System.out.println("ArrayList : " + arrayList + ", 작업시간 : " + (end - start));
		
		start = System.nanoTime();
		vector.add(1);
		vector.add(9);
		vector.add(3);
		vector.add(7);
		vector.add(5);
		end = System.nanoTime();
		System.out.println("Vector : " + vector + ", 작업시간 : " + (end - start));
		
		start = System.nanoTime();
		stack.add(1);
		stack.add(9);
		stack.add(3);
		stack.add(7);
		stack.add(5);
		end = System.nanoTime();
		System.out.println("Stack : " + stack + ", 작업시간 : " + (end - start));
		
		System.out.println("[ Queue ]");
		
		start = System.nanoTime();
		linkedListQueue.offer(1);
		linkedListQueue.offer(9);
		linkedListQueue.offer(3);
		linkedListQueue.offer(7);
		linkedListQueue.offer(5);
		end = System.nanoTime();
		System.out.println("LinkedList(Queue) : " + linkedListQueue + ", 작업시간 : " + (end - start));
		
		start = System.nanoTime();
		priorityQueue.offer(1);
		priorityQueue.offer(9);
		priorityQueue.offer(3);
		priorityQueue.offer(7);
		priorityQueue.offer(5);
		end = System.nanoTime();
		System.out.println("PriorityQueue : " + priorityQueue + ", 작업시간 : " + (end - start));
		
		start = System.nanoTime();
		arrayQueue.offer(1);
		arrayQueue.offer(9);
		arrayQueue.offer(3);
		arrayQueue.offer(7);
		arrayQueue.offer(5);
		end = System.nanoTime();
		System.out.println("ArrayQueue : " + arrayQueue + ", 작업시간 : " + (end - start));
		
		System.out.println("[ Deque ]");
		
		start = System.nanoTime();
		arrayDeque.offer(1);
		arrayDeque.offer(9);
		arrayDeque.offer(3);
		arrayDeque.offer(7);
		arrayDeque.offer(5);
		end = System.nanoTime();
		System.out.println("ArrayDeque : " + arrayDeque + ", 작업시간 : " + (end - start));
		
		System.out.println("[ Map ]");
		
		start = System.nanoTime();
		hashMap.put(0, 1);
		hashMap.put(1, 9);
		hashMap.put(2, 3);
		hashMap.put(3, 7);
		hashMap.put(4, 5);
		end = System.nanoTime();
		System.out.println("HashMap : " + hashMap + ", 작업시간 : " + (end - start));
		
		start = System.nanoTime();
		treeMap.put(0, 1);
		treeMap.put(1, 9);
		treeMap.put(2, 3);
		treeMap.put(3, 7);
		treeMap.put(4, 5);
		end = System.nanoTime();
		System.out.println("TreeMap : " + treeMap + ", 작업시간 : " + (end - start));
		
		
	}
	
}
