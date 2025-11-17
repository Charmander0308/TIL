import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 그래프최소비용2_다익스트라_반복문 {
	static class Edge {
		int to, cost;

		public Edge(int to, int cost) {
			this.to = to;
			this.cost = cost;
		}
	}

	static final int INF = Integer.MAX_VALUE;
	static int V, E; // 정점의수, 간선의 수
	static List<Edge>[] adj;// 인접리스트
	static int[] dist; // 거리저장
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		V = sc.nextInt(); // 정점의 시작번호가 1인지 0인지를 잘보자
		E = sc.nextInt();

		adj = new ArrayList[V];
		for (int i = 0; i < V; i++) {
			adj[i] = new ArrayList<>();
		}
		dist = new int[V];
		Arrays.fill(dist, INF);
		visited = new boolean[V];
		
		for (int i = 0; i < E; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			int cost = sc.nextInt();

			adj[from].add(new Edge(to, cost));// 현재는 방향이 있다!
		}

		dijkstra(0);// 시작지점을 던진다.

		System.out.println(Arrays.toString(dist));

	}

	private static void dijkstra(int start) {
		
		dist[start] = 0; //시작 정점의 거리 값을 0으로 갱신 -> 내가 뽑히도록 유도
		for(int i = 0 ; i<V-1; i++) {
			//1. dist가 가장 작으면서 방문하지 않았으면 뽑아
			int min = INF;
			int idx = -1;
			for(int j = 0; j<V; j++) {
				if(!visited[j] && dist[j] < min) {
					min = dist[j];
					idx = j;
				}
			}//가장 작은거 뽑았어!
			
			if(idx == -1) break; //선택할 수 있는게 없더라 ㅠ
			
			
			visited[idx] = true; //start라는 정점에서 idx정점까지의 최소거리는 결정이 되었음!
			
			//2. 갱신
			for(Edge e : adj[idx]) {
				//방문하지 않았으면서, 갱신할 여지가 있다면 갱신
				if(!visited[e.to]&& dist[e.to]> dist[idx]+e.cost) {
					dist[e.to]= dist[idx] + e.cost; 
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
