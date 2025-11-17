import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 그래프최소비용3_플로이드워셜 {
	static final int INF = Integer.MAX_VALUE;

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(input2);

		int V = sc.nextInt(); // 시작정점 확인
		int E = sc.nextInt();

		int[][] dist = new int[V][V];

		// 초기화 -> 나자신은 0으로 나머지는 죄다 INF
		for (int i = 0; i < V; i++) {
			for (int j = 0; j < V; j++) {
				if (i != j)
					dist[i][j] = INF;
			}
		}
		for (int i = 0; i < E; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			int cost = sc.nextInt();

			dist[from][to] = cost; // 유향이니까
		} // 입력 마무리

		// 플로이드 워셜
		for (int k = 0; k < V; k++) {
			for (int from = 0; from < V; from++) {
				if (dist[from][k] == INF)
					continue; // 출발지->경유지 연결x 의미없음
				for (int to = 0; to < V; to++) {
					if (dist[k][to] == INF)
						continue; // 경유지->도착지로 연결 X 의미없음
					dist[from][to] = Math.min(dist[from][to], dist[from][k] + dist[k][to]);
				} // 도착지
			} // 출발지
		} // 경유지

		// 음수사이클 검사 -> 옵션
		boolean negativeCycle = false;
		for (int i = 0; i < V; i++) {
			if (dist[i][i] < 0) {
				negativeCycle = true;
				break;
			}
		}
		
		if(negativeCycle) {
			System.out.println("음수 사이클 존재");
			for(int[] tmp : dist) {
				System.out.println(Arrays.toString(tmp));
			}
		}else {
			for(int[] tmp : dist) {
				System.out.println(Arrays.toString(tmp));
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

	// 음의 사이클 X
	static String input1 = "5 9\r\n" + "0 1 3\r\n" + "0 2 8\r\n" + "0 4 -4\r\n" + "1 3 1\r\n" + "1 4 7\r\n"
			+ "2 1 4\r\n" + "3 0 2\r\n" + "3 2 -5\r\n" + "4 3 6\r\n" + "\r\n" + "";

	static String input2 = "4 5\r\n" + "0 1 1\r\n" + "0 3 4\r\n" + "1 2 1\r\n" + "2 0 -3\r\n" + "3 2 2\r\n" + "\r\n"
			+ "";
}
