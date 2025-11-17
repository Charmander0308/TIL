import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 그래프최소비용1_크루스칼 {
	static int V, E; // 정점의개수, 간선의개수
	static int[] p; // 대표를 저장할 배열
//	static int[] rank; //균형있게 만들자 -> 완벽한 균형은 아니야 

	// 간선배열
	// 1. Edge 클래스
	// 2. int[]

	static class Edge implements Comparable<Edge> {
		int from, to, cost;

		public Edge(int from, int to, int cost) {
			this.from = from;
			this.to = to;
			this.cost = cost;
		}

		@Override
		public int compareTo(Edge o) {
			return this.cost - o.cost;
		}

//		@Override
//		public String toString() {
//			return "Edge [from=" + from + ", to=" + to + ", cost=" + cost + "]";
//		}

	}

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(input);

		V = sc.nextInt();
		E = sc.nextInt();

		Edge[] edges = new Edge[E];

//		int[][] edges2 = new int[E][3]; //[0]:from, [1]:to, [2]:cost

		for (int i = 0; i < E; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			int cost = sc.nextInt();

			// 간선 배열이라서 to from 같은거 저장할 필요는 없다!
			edges[i] = new Edge(from, to, cost);
//			edges2[i] = new int[] {from, to, cost};
		} // 입력끝

		// 간선 정렬! (사용자 정의 객체를 정렬 -> 1.Comparable, 2. Comparator)

		Arrays.sort(edges);

//		Arrays.sort(edges, new Comparator<Edge>() {
//			@Override
//			public int compare(Edge o1,Edge o2) {
//				return o1.cost - o2.cost;
//			}
//		});

//		Arrays.sort(edges2, new Comparator<int[]>() {
//
//			@Override
//			public int compare(int[] o1, int[] o2) {
//				//[2] : cost
//				return o1[2] -o2[2];
//			}
//		});

		// 1. 대표집합을 만든다
		p = new int[V];
//		rank = new int[V];
		// make-set 호출
		for (int i = 0; i < V; i++) {
//			makeSet(i);
			p[i] = i;
		}

		int ans = 0;
		// V-1개의 간선을 뽑아야해~~
		// while, for
		for (int i = 0, pick = 0; i < E && pick < V - 1; i++) {
//			int from = edges[i].from;
//			int to = edges[i].to;
//			
//			
//			if(findSet(from) != findSet(to)) {
//				//유니온해!
//				union(from, to);
//				pick++;
//				ans += edges[i].cost;
//			}

			int px = findSet(edges[i].from);
			int py = findSet(edges[i].to);
			if (px != py) {
				p[py] = px; // 최대한 코드는 심플하게
				pick++;
				ans += edges[i].cost;
			}

		}

		System.out.println(ans);

	}

	static void union(int x, int y) {
		// 이번에 넘어온 x, y가 대표라는 보장이 없으므로 findSet 할꺼야
		p[findSet(y)] = findSet(x);
//		p[y] = x; //대표를 내려보낸다는 확신만 있으면

//		if(rank[findSet(x)] > rank[findSet(y)])
//			p[findSet(y)] = findSet(x);
//		else {
//			//반대의 경우도 처리
//			//만약 랭크가 같다면 하나 증가
//		}
	}

	// 재귀가 아니라 그냥 단순하게 반복문을 이용해서 짤수도 있음
	static int findSet(int x) {
		// 기본 형태
//		if(x != p[x]) return findSet(p[x]);
//		return x;

		// 경로압축
		if (x != p[x])
			p[x] = findSet(p[x]);
		return p[x];
	}

	// x를 자신의 대표로 세팅
	static void makeSet(int x) {
		p[x] = x;
		// rank[x] = 0;
	}

	static String input = "7 11\r\n" + "0 1 32\r\n" + "0 2 31\r\n" + "0 5 60\r\n" + "0 6 51\r\n" + "1 2 21\r\n"
			+ "2 4 46\r\n" + "2 6 25\r\n" + "3 4 34\r\n" + "3 5 18\r\n" + "4 5 40\r\n" + "4 6 51\r\n" + "";
}
