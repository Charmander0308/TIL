import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 그래프최소비용2_다익스트라_우선순위큐 {
	static class Edge implements Comparable<Edge> {
		int to, cost;

		public Edge(int v, int w) {
			this.to = v;
			this.cost = w;
		}

		@Override
		public int compareTo(Edge o) {
			return Integer.compare(this.cost, o.cost);
		}
	}

	static final int INF = Integer.MAX_VALUE;
	static int V, E;
	static List<Edge>[] adjList; // 인접리스트
	static int[] dist;

	public static void main(String[] args) {
		Scanner sc = new Scanner(input);

		V = sc.nextInt();
		E = sc.nextInt();

		adjList = new ArrayList[V];
		for (int i = 0; i < V; i++) {
			adjList[i] = new ArrayList<>();
		} // 초기화 완료

		dist = new int[V];
		Arrays.fill(dist, INF);

		for (int i = 0; i < E; i++) {
			// 시작정점 도착정점 가중치 순으로 입력이 된다.
			adjList[sc.nextInt()].add(new Edge(sc.nextInt(), sc.nextInt()));
		}

		dijkstra(0);

		System.out.println(Arrays.toString(dist));
	}

	private static void dijkstra(int start) {
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		boolean[] visited = new boolean[V]; // 방문처리

		dist[start] = 0; // 시작 노드까지의 거리는 0으로 초기화

		pq.add(new Edge(start, 0));

		while (!pq.isEmpty()) {
			Edge curr = pq.poll();

			if (visited[curr.to])
				continue; // 이미 방분했다면 비용을 알고 있다는 뜻
			visited[curr.to] = true; // 선택

			for (Edge node : adjList[curr.to]) {
				if (!visited[node.to] && dist[node.to] > dist[curr.to] + node.cost) {
					dist[node.to] = dist[curr.to] + node.cost;
					pq.add(new Edge(node.to, dist[node.to]));
				}
			}
		}

	}

	static String input = "6 11\r\n" + "0 1 4\r\n" + "0 2 2\r\n" + "0 5 25\r\n" + "1 3 8\r\n" + "1 4 7\r\n"
			+ "2 1 1\r\n" + "2 4 4\r\n" + "3 0 3\r\n" + "3 5 6\r\n" + "4 3 5\r\n" + "4 5 12\r\n" + "";
}
