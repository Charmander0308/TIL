import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 그래프최소비용2_프림_우선순위큐 {
	static final int INF = Integer.MAX_VALUE;

	static class Edge implements Comparable<Edge> {
		int to, cost;

		public Edge(int to, int cost) {
			this.to = to;
			this.cost = cost;
		}

		@Override
		public int compareTo(Edge o) {
			return this.cost - o.cost;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(input);

		int V = sc.nextInt();// 정점 (0번 시작)
		int E = sc.nextInt();// 간선

		List<Edge>[] adj = new ArrayList[V];
		for (int i = 0; i < V; i++) {
			adj[i] = new ArrayList<>();
		} // 초기화완료

		for (int i = 0; i < E; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			int cost = sc.nextInt();

			// 무향
			adj[from].add(new Edge(to, cost));
			adj[to].add(new Edge(from, cost));
		} // 입력끝

		// 프림을 돌리기 위해서 필요한 정보들...
		boolean[] visited = new boolean[V]; // 트리인지 아닌지를 판단
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		int ans = 0;

		int pick = 0; // V-1개 뽑
		pq.add(new Edge(0,0));
		
//		visited[0] = true; // 0번은 뽑았어! 0번과 연결되어있는 모든 정점들 전부 넣을꺼야
//
//		for (int i = 0; i < adj[0].size(); i++) {
//			pq.add(adj[0].get(i));
//		}
//		
		// 넣는거 위랑 같아
//		for(Edge e : adj[0])
//			pq.add(e);

		while (pick < V ) {
			Edge e = pq.poll();
			if (visited[e.to])
				continue;

			ans += e.cost;
			visited[e.to] = true;
			pick++;

			// to정점과 연결되어있으면 전부다 넣자
			pq.addAll(adj[e.to]);
		}

		System.out.println(ans);

	}

	static String input = "7 11\r\n" + "0 1 32\r\n" + "0 2 31\r\n" + "0 5 60\r\n" + "0 6 51\r\n" + "1 2 21\r\n"
			+ "2 4 46\r\n" + "2 6 25\r\n" + "3 4 34\r\n" + "3 5 18\r\n" + "4 5 40\r\n" + "4 6 51\r\n" + "";
}
