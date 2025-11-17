import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_02_배열_dist {
	static int N; // NxN 크기의 2차원 배열이 주어진다.
	static int[][] map; // 2차원 배열
	static int[][] dist; // 거리 저장 겸 방문 쳌

	// 4방향 탐색(상하좌우)
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(input);
		N = sc.nextInt();
		map = new int[N][N];
		dist = new int[N][N]; // 문제에 따라 전체를 무한대(아주 큰값)으로 초기화 해야할지도

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();
			}
		} // 미로 입력 완료!

//		문제에서 출발지, 도착지를 다음과 같이 주었다고 가정!
//		(0,0)->(N-1, N-1) 이동
		int ans = bfs(0,0);
		
		System.out.println(ans);
		System.out.println(dist[N-1][N-1]);

	}

	// 시작좌표 (r,c)
	static int bfs(int r, int c) {
		// Q에 좌표의 정보를 저장
		// 1. 1차원 배열
		// 2. 클래스를 정의
		Queue<int[]> q = new LinkedList<>();

		// 시작정점을 넣어줘잉!
//		int[] start = new int[2];
//		start[0] = r;
//		start[1] = c;
//		q.add(start);

		q.add(new int[] { r, c });
		dist[r][c] = 1;

		while (!q.isEmpty()) {
			int[] curr = q.poll(); // 하나의 좌표를 꺼내라

			// 꺼냈을 때 (도착지점이라면?)
			if (curr[0] == N - 1 && curr[1] == N - 1) {
				return dist[N-1][N-1];
			}

			// 4방향 탐색 넣을 수 있으면 넣어
			for (int i = 0; i < 4; i++) {
				int nr = curr[0] + dr[i];
				int nc = curr[1] + dc[i];// 다음 좌표

				// 1. 범위를 벗어났는지 쳌
				if (nr < 0 || nc < 0 || nr >= N || nc >= N)
					continue;
				// 2. 벽인지 쳌
				if (map[nr][nc] == 1)
					continue;
				// 3. 이미 거리가 결정이 되었는지 쳌
				if (dist[nr][nc] != 0)
					continue;

				// 거리기록
				dist[nr][nc] = dist[curr[0]][curr[1]] + 1;
				q.add(new int[] { nr, nc });
			}
		}
		
		return -1;

	}

	static String input = "8\r\n" + "0 0 1 1 1 1 1 1\r\n" + "1 0 0 0 0 0 0 1\r\n" + "1 1 1 0 1 1 1 1\r\n"
			+ "1 1 1 0 1 1 1 1\r\n" + "1 0 0 0 0 0 0 1\r\n" + "1 0 1 1 1 1 1 1\r\n" + "1 0 0 0 0 0 0 0\r\n"
			+ "1 1 1 1 1 1 1 0\r\n" + "";
}
