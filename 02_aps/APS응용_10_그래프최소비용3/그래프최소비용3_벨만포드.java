import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 그래프최소비용3_벨만포드 {
	static class Edge {
		int from, to, cost;

		public Edge(int from, int to, int cost) {
			this.from = from;
			this.to = to;
			this.cost = cost;
		}
	}
	
	static int[] dist; //거리배열
	static final int INF = Integer.MAX_VALUE;
	static int V, E; //정점의 수, 간선의 수
	static List<Edge> edges;
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(input2);
		
		V = sc.nextInt(); //시작정점은 0번
		E = sc.nextInt();
		
		//간선배열로 저장하겠다
		edges = new ArrayList<>();
		dist = new int[V];
		for(int i = 0 ; i<E; i++) {
			//유향
			int from = sc.nextInt();
			int to = sc.nextInt();
			int cost = sc.nextInt();
			
			edges.add(new Edge(from, to, cost));
			
		}//간선을 입력받자!
		
		bellmanFord(0);
	}
	
	//start : 시작정점
	//dist, V, edges 이런것도 static 하게 만들지 않았다면.... 인자로 들고 있어야한다.
	static void bellmanFord(int start) {
		//dist 초기화 -> 시작정점을 제외한 나머지는 INF
		Arrays.fill(dist, INF);
		dist[start] = 0; //시작정점만 0으로 바꾼다.
		
		//1. 모든 간선을 (V-1)반복 -> Relaxation 작업 수행할련다!
		for(int i = 0; i<V-1; i++) {
			boolean flag = false; //조기 종료 조건!
			for(Edge e : edges) {
				//갱신 : 출발점이 무한대 아닌 애들만 갱신할꺼야
				if(dist[e.from] != INF && dist[e.to] > dist[e.from] + e.cost ) {
					dist[e.to] = dist[e.from] + e.cost;
					flag = true;//갱신일어났어
				}
			}
			
			if(!flag) break;//갱신이 일어나지 않았다! -> 조기종료
		}//반복 횟수
		
		
		//2. 음수 사이클 쳌
		boolean negativeCycle = false;
		for(Edge e : edges) {
			if(dist[e.from] != INF && dist[e.to] > dist[e.from] + e.cost ) {
				negativeCycle = true;//갱신일어났어
				break;
			}
		}
		
		if(negativeCycle)
			System.out.println("음의 사이클이 있어서 무의미하다");
		else {
			System.out.println(Arrays.toString(dist));
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//음의 사이클 X
	static String input1 = "6 7\r\n"
			+ "0 1 4\r\n"
			+ "0 2 5\r\n"
			+ "1 3 -2\r\n"
			+ "2 4 8\r\n"
			+ "3 5 7\r\n"
			+ "4 2 -3\r\n"
			+ "4 5 6";
	
	static String input2 = "4 4\r\n"
			+ "0 1 5\r\n"
			+ "1 2 -8\r\n"
			+ "2 1 3\r\n"
			+ "2 3 6\r\n"
			+ "";
}
