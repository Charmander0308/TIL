import java.util.Scanner;
import java.util.Stack;

public class DFS_01_그래프 {
	static int V, E; // 정점의 개수(1번부터), 간선의 개수
	static int[][] adj; // 인접행렬
	static boolean[] visited; // 방문처리

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(input);

		V = sc.nextInt();
		E = sc.nextInt();

		adj = new int[V + 1][V + 1]; // 1번 정점부터 시작이므로 한칸씩 더 크게 만들어!
		visited = new boolean[V + 1];

		// 간선입력
		for (int i = 0; i < E; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt(); // 한줄 짜리 입력이든, E개의줄 입력이든.. 상관 없다!
			adj[A][B] = 1; // 마무리 하면 안된다.
			adj[B][A] = 1; // 무향이므로 반대로도 연결 해줘!
		}

//		dfs(1);
		dfsStack(1);

	}

	// v : 현재 방문하는 정점
	static void dfs(int v) {
		visited[v] = true;
		// 출력을 하고 있지만.... 사실은 특정 작업을 수행해야 할지도 모름
		System.out.println(v);
		// 나와 인접하면서, 방문하지 않은 정점들을 전부 돌릴거야~~
		for (int w = 1; w <= V; w++) {
			// 방문하지 않았니?
			if (!visited[w] && adj[v][w] == 1) {
				dfs(w);
			}
		}
	}

	// start : 시작정점
	static void dfsStack(int start) {
		// 지금은 단순히 정점의 정보만 담아 두지만... 여러 정보를 담을 지도 모름 (클래스, int[])
		Stack<Integer> stack = new Stack<>();
		visited = new boolean[V + 1];

		stack.push(start); // 시작 정점을 스택에 넣고 시작!

		while (!stack.isEmpty()) {
			// 현재 정점의 번호를 꺼냈다!
			// 여러개의 정보라면 class, int[] 일수도 있다!
			int curr = stack.pop();

			//지금 상태에서는 중복된 노드가 좀 나오는거 같은데... 
			//왜그러지? (해결해 보세요~~)
			visited[curr] = true;
			System.out.println(curr);

			for (int i = V; i > 0; i--) {
				if (!visited[i] && adj[curr][i] == 1) {
					stack.push(i);
				}
			}
		}

	}

	static String input = "7 9\r\n" + "1 2\r\n" + "1 3\r\n" + "1 6\r\n" + "2 4\r\n" + "2 7\r\n" + "3 4\r\n" + "4 7\r\n"
			+ "5 6\r\n" + "5 7";
}
