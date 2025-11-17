import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_03_배열_클래스정의 {
	static class Pos {
		int r, c, dist;

		public Pos(int r, int c, int dist) {
			this.r = r;
			this.c = c;
			this.dist = dist;
		}

		@Override
		public String toString() {
			return "Pos [r=" + r + ", c=" + c + ", dist=" + dist + "]";
		}
	}

	static int N; // NxN 크기의 2차원 배열이 주어진다.
	static int[][] map; // 2차원 배열
	static boolean[][] visited; // 방문쳌

	// 4방향 탐색(상하좌우)
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(input);
		N = sc.nextInt();
		map = new int[N][N];
		visited = new boolean[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();
			}
		} // 미로 입력 완료!

//		문제에서 출발지, 도착지를 다음과 같이 주었다고 가정!
//		(0,0)->(N-1, N-1) 이동
		int ans = bfs(0, 0);

		System.out.println(ans);

	}

	// 시작좌표 (r,c)
	static int bfs(int r, int c) {
		// Q에 좌표의 정보를 저장
		// 1. 1차원 배열
		// 2. 클래스를 정의
		Queue<Pos> q = new LinkedList<>();

		// 시작정점을 넣어줘잉!
		q.add(new Pos(r, c, 1));
		visited[r][c] = true;

		while (!q.isEmpty()) {
			Pos curr = q.poll(); // 하나의 좌표를 꺼내라

			// 꺼냈을 때 (도착지점이라면?)
			if (curr.r == N - 1 && curr.c == N - 1) {
				return curr.dist;
			}

			// 4방향 탐색 넣을 수 있으면 넣어
			for (int i = 0; i < 4; i++) {
				int nr = curr.r + dr[i];
				int nc = curr.c + dc[i];// 다음 좌표

				// 범위를 벗어났는지 쳌 / 벽인지 / 방문했는지
				if (nr < 0 || nc < 0 || nr >= N || nc >= N || map[nr][nc] == 1 || visited[nr][nc])
					continue;
				// 다음좌표 갈수있으면 넣기
				visited[nr][nc] = true;
				q.add(new Pos(nr, nc, curr.dist + 1));
			}
		}

		return -1;

	}

	static String input = "8\r\n" + "0 0 1 1 1 1 1 1\r\n" + "1 0 0 0 0 0 0 1\r\n" + "1 1 1 0 1 1 1 1\r\n"
			+ "1 1 1 0 1 1 1 1\r\n" + "1 0 0 0 0 0 0 1\r\n" + "1 0 1 1 1 1 1 1\r\n" + "1 0 0 0 0 0 0 0\r\n"
			+ "1 1 1 1 1 1 1 0\r\n" + "";
}
