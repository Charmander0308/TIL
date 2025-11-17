package DFS;

import java.util.Scanner;
import java.util.Stack;

public class DFS_01_그래프 {
	static int V;	//정점의 개수(1번부터)
	static int E;	//간선의 개수
	static int[][]adj;
	static boolean[] visited;
	static boolean[] isPushed;
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(input);
		
		V = sc.nextInt();
		E = sc.nextInt();
		
		adj = new int[V+1][V+1];	//간선정보 저장
		visited = new boolean[V+1];	//방문 정보 저장
		
		for(int i=0; i<E; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			adj[A][B] = 1;
			adj[B][A] = 1;
		}
		
		dfs(1);
		System.out.println("=======");
		dfsStack(1);
		
	}
	
	//v : 현재 방문하는 정점
	static void dfs(int v) {
		visited[v] = true;
		//출력을 하고 있지만... 사실은 특정 작업을 수행해야 할 지도 모름
		System.out.println(v);
		//나와 인접하면서, 방문하지 않은 정점들을 전부 돌릴거야~
		for(int i=1; i<V+1; i++) {
			//방문하지 않았니?
			if(!visited[i] && adj[v][i] == 1) {
				dfs(i);
			}
		}
	}
	
	//start : 시작정점
	static void dfsStack(int start) {
		//지금은 단순히 정점의 정보만 담아 두지만.. 실제론 여러 정보를 담을지도 모름(클래스, int[] 등)
		Stack<Integer> stack = new Stack<>();
		visited = new boolean[V+1];
		isPushed = new boolean[V+1];
		
		stack.push(start);	//시작 정점을 스택에 넣고 시작
		
		while(!stack.isEmpty()) {
			//현재 정점의 번호를 꺼냈다!
			//여러개의 정보라면 class, int[] 일 수도 있다!
			int curr = stack.pop();
			
			//지금 상태에서는 중복된 노드가 좀 나오는 거 같은데...
			//왜그러지?(해결해보자)
			visited[curr] = true;
			System.out.println(curr);
			
			for(int i=V; i>0; i--) {
				if(!visited[i] && adj[curr][i] == 1 && !isPushed[i]) {
					stack.push(i);
					isPushed[i] = true;
				}
			}
		}
	}
	
	static String input = 
			"7 9\r\n"
			+ "1 2\r\n"
			+ "1 3\r\n"
			+ "1 6\r\n"
			+ "2 4\r\n"
			+ "2 7\r\n"
			+ "3 4\r\n"
			+ "4 7\r\n"
			+ "5 6\r\n"
			+ "5 7";
					
}
