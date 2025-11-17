import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BFS_01_그래프 {
	static int V, E;
	static List<Integer>[] adjList;// 인접리스트
	static boolean[] visited; // 방문쳌
	static Queue<Integer> q;

	public static void main(String[] args) {
		// bfs 재귀도 아니고 그냥 자료구조 하나를 이용하여 반복문 돌리면 끝
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(input);

		V = sc.nextInt();
		E = sc.nextInt();

		adjList = new ArrayList[V + 1];
		// 아래의 작업은 꼭 필요해!
		for (int i = 1; i <= V; i++) {
			adjList[i] = new ArrayList<>();
		}

		visited = new boolean[V + 1];

		for (int i = 0; i < E; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			adjList[A].add(B);
			adjList[B].add(A);
			// 유향이었다면
//			adjList[sc.nextInt()].add(sc.nextInt());
		}

		bfs(1);

	}

	// 학습용이니 외부에서 만들자
	// v : 시작정점
	static void bfs(int v) {
		q = new LinkedList<>(); // 큐생성

		q.add(v); // 시작정점 넣기
		visited[v] = true; // 시작정점 방문쳌

		// 큐가 공백상태가 될때까지
		// 큐가 공백이 아니라면
		while (!q.isEmpty()) {
			int curr = q.poll(); // 하나 꺼내고
			// 꺼낸 걸로 작업해라!
			System.out.println(curr);

			// curr 정점과 인접하면서, 방문하지 않은 정점들을 Q에 넣는다.
//			for(int i =0; i<adjList[curr].size(); i++) {
//				int w = adjList[curr].get(i); //w 인접한 정점
//				//인접행렬에서는 방문했는지와 연결되어있는지 쳌이 필요했다면.
//				//인접리스트는 그런거 필요없다
//				if(!visited[w]) {
//					q.add(w);
//					visited[w] = true;
//				}
//			}

			for (int w : adjList[curr]) {
				if (!visited[w]) {
					q.add(w);
					visited[w] = true;
				}
			}
		} // BFS

	}

	// 정점 7개, 간선 9개
	// 두개의 정점이 주어진다.
	// 무향!
	static String input = "7 9\r\n" + "1 2\r\n" + "1 3\r\n" + "1 6\r\n" + "2 4\r\n" + "2 7\r\n" + "3 4\r\n" + "4 7\r\n"
			+ "5 6\r\n" + "5 7\r\n" + "";
}
