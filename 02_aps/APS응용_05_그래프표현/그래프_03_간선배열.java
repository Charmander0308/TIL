import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//간선 : 클래스로 정의 해서 저장, int[] 이용해서 저장할 수도 있다.
public class 그래프_03_간선배열 {
	static class Edge {
		int A, B, W; // 시작, 끝, 가중치

		public Edge(int a, int b, int w) {
			A = a;
			B = b;
			W = w;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// V, E 가 주어진다.
		int V = sc.nextInt(); // 정점의 개수 -> 0부터시작인지, 1부터시작인지 문제보고 판단
		int E = sc.nextInt(); // 간선의 개수 (두개의 정점이 주어진다. -> 정점의 순서대로 주어진다는 보장은 없다)

		// 객체 배열 형태로 저장할거야
		Edge[] edges = new Edge[E];

		// 간선의 정보를 입력받자
		for (int i = 0; i < E; i++) {
			int A = sc.nextInt(); // 두개의 정점 정보가 주어진다.
			int B = sc.nextInt();
			int W = sc.nextInt(); // 간혹 가중치를 줄때도 있다더라! -> 없으면 1 저장

			edges[i] = new Edge(A, B, W); // 유향, 무향 중요한가? 문제풀때 인지하고 풀긴해야함
		}
		// 객체 리스트로 저장할 수 도 있다.
		List<Edge> edgeList = new ArrayList<>();
		for (int i = 0; i < E; i++) {
			edgeList.add(new Edge(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		}

		// 2차원 배열을 이용해서 저장하면?
		int[][] edgeArr = new int[E][3]; // [0]:시작정점, [1]:도착정점, [2]:가중치
		for (int i = 0; i < E; i++) {
			edgeArr[i][0] = sc.nextInt();// [0]:시작정점
			edgeArr[i][1] = sc.nextInt();// [1]:도착정점
			edgeArr[i][2] = sc.nextInt();// [2]:가중치
		}

	}
}
