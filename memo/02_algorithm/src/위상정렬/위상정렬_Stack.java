package 위상정렬;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class 위상정렬_Stack {
	public static String[] cook = { "", "재료구매", 
			"양념장만들기", "고기재우기", "고기손질", "제육볶음만들기", 
			"식사", "뒷정리", "채소손질", "밥하기" };
	static int V, E;	//노드, 간선
	static List<Integer>[] adjList;
	static boolean[] visited;
	static Stack<Integer> ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(input);
		
		V = sc.nextInt();	//1번부터 시작해버렸다
		E = sc.nextInt();
		visited = new boolean[V+1];
		ans = new Stack<>();
		int[] inDegree = new int[V+1];
		
		adjList = new ArrayList[V+1];
		for(int i=1; i<V+1; i++) {
			adjList[i] = new ArrayList<>();
		}
		
		for(int i=0; i<E; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			adjList[from].add(to);	
			inDegree[to]++;	//진입차수를 1 증가
		} //입력 완료
		
		for(int i=1; i<V+1; i++) {
			if(inDegree[i] == 0) {
				dfs(i);
			}
		}
		
		while(!ans.isEmpty())
			System.out.println(cook[ans.pop()]);
		
	}
	
	static void dfs(int v) {
		visited[v] = true;	//방문을 했다 -> 작업을 수행했다가 아닙니다.
		
		for(int to : adjList[v]) {
			//to는 v와 인접한 정점이 들어온다.
			//방문하지 않았고, 인접하다면 가보자~
			if(!visited[to])
				dfs(to);
		}
		//방문이 끝났으면 Stack에 v를 넣어
		ans.push(v);
	}

	static String input = "9 9\r\n"
			+ "1 4\r\n"
			+ "1 8\r\n"
			+ "2 3\r\n"
			+ "4 3\r\n"
			+ "8 5\r\n"
			+ "3 5\r\n"
			+ "5 6\r\n"
			+ "9 6\r\n"
			+ "6 7";

}
