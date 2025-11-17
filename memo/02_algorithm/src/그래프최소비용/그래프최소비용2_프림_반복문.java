package 그래프최소비용;

import java.util.Arrays;
import java.util.Scanner;

public class 그래프최소비용2_프림_반복문 {
	static final int INF = Integer.MAX_VALUE;	//무한대를 표현하는용
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(input);
		
		int V = sc.nextInt();	//정점 (0번 시작)
		int E = sc.nextInt();	//간선
		
		int[][] adj = new int[V][V];	//인접행렬
		
		for(int i=0; i<E; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			int cost = sc.nextInt();
			
			//무향
			adj[from][to] = adj[to][from] = cost;
		}//입력끝
		
		//프림을 돌리기 위해서 필요한 정보들..
		//부모 정보, 가중치 정보, 방문 체크
		int[] p = new int[V];	//부모님이 누구니?
		int[] dist = new int[V];	//key 저장배열
		boolean[] visited = new boolean[V];	//트리인지 아닌지를 판단
		
		//1. dist 배열 초기화! -> 아주 큰 값으로
		for(int i=0; i<V; i++) {
			dist[i] = INF;
		}
		Arrays.fill(p, -1);	//0번 정점도 있으니까~
		
		//2. 시작정점 골라(임의의 정점 아무거나 골라도 OK)
		dist[0] = 0;	//이래야 뽑혀요~~
		int ans = 0;
		
		//3. 전체 반복문을 수행하면서 정점을 뽑겠다
		for(int i=0; i<V; i++) {	//V or V-1 상관x
			//3-1. key 중 뽑히지 않았으면서, 가장 작은 정점 선택
			int min = INF;
			int idx = -1;
			for(int j=0; j<V; j++) {
				if(!visited[j] && dist[j] < min) {
					min = dist[j];
					idx = j;
				}
			}//정점을 선택
			
			//idx: 현재 트리가 아니면서 가장 작은 값을 가지고 있는 정점이 선택이 되었다!
			visited[idx] = true;	//이제 포함했다
			ans += dist[idx];	//만약 이 코드를 여기다 쓸거면 for문 조건을 V로 해야함!
			//3-2. 뽑은 정점과 연결된 간선이 있다면, 그리고 갱신할 수 있다면 갱신
			for(int j=0; j<V; j++) {
				//방문하지 않았으면서, 갱신의 여지가 있으면
				if(!visited[j] && adj[idx][j] != 0 && dist[j] > adj[idx][j]) {
					dist[j] = adj[idx][j];
					p[j] = idx;	//부모정보 갱신
				}
			}
		}//뽑는 횟수
		
//		for(int i=0; i<V; i++) {
//			ans+=dist[i];
//		}
		System.out.println(ans);
		
	}
	
	static String input = "7 11\r\n"
			+ "0 1 32\r\n"
			+ "0 2 31\r\n"
			+ "0 5 60\r\n"
			+ "0 6 51\r\n"
			+ "1 2 21\r\n"
			+ "2 4 46\r\n"
			+ "2 6 25\r\n"
			+ "3 4 34\r\n"
			+ "3 5 18\r\n"
			+ "4 5 40\r\n"
			+ "4 6 51\r\n"
			+ "";
}
