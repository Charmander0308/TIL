import java.util.Scanner;

public class DFS_02_배열 {
	static int N; // 2차원 정사각 배열이 주어진다.
	static int[][] map; // 2차원 배열
	static boolean[][] visited;
	static boolean ans; // 탈출 가능 여부 (못해로 초기화)

	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(input);
		N = sc.nextInt();
		map = new int[N][N]; // 벽을 세우는 트릭을 사용한다면 -> N+2, N+2;
		visited = new boolean[N][N]; // 원본을 훼손하는 코드로 간다면 필요치 않을수도 있음
		ans = false;

//		(0,0) -> (N-1, N-1) 갈 수있는지 확인
		// 간혹 입구를 2, 출구를 3 주는 경우도 있더라!
		// 이경우에 입력을 받으면서 미리 위치를 확보해 두는 경우도 있음
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();
			}
		} // 입력 끝!

		dfs(0,0);
		System.out.println(ans);
	}

	// r : 행, c : 열
	static void dfs(int r, int c) {
		// 기저조건을 작성해야한다.
		if (r == N - 1 && c == N - 1) {
			ans = true;
			return;
		}

		visited[r][c] = true; // 벽을 세워도 좋아

		// 4방향 탐색
		for (int i = 0; i < 4; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];

			// nr, nc 라고 하는 좌표가 유효한지 쳌
			// 1. 범위를 벗어났는지 쳌
			if (nr < 0 || nc < 0 || nr >= N || nc >= N)
				continue;
			// 2. 벽이니 쳌
			if (map[nr][nc] == 1)
				continue;
			// 3. 이미 간곳인가 쳌
			if (visited[nr][nc])
				continue;
			// 위의 조건으로 3가지를 조건을 걸었는데 -> 벽처리하면 하나로 끝낼수도 있음
			dfs(nr, nc);

		}
	}

	static String input = "8\r\n" + "0 0 1 1 1 1 1 1\r\n" + "1 0 0 0 0 0 0 1\r\n" + "1 1 1 0 1 1 1 1\r\n"
			+ "1 1 1 0 1 1 1 1\r\n" + "1 0 0 0 0 0 0 1\r\n" + "1 0 1 1 1 1 1 1\r\n" + "1 0 0 0 0 0 0 0\r\n"
			+ "1 1 1 1 1 1 1 0\r\n" + "";
}
