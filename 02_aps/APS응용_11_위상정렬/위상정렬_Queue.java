import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 위상정렬_Queue {
	public static String[] cook = { "", "재료구매", "양념장만들기", "고기재우기", "고기손질", "제육볶음만들기", "식사", "뒷정리", "채소손질", "밥하기" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(input);

		int V = sc.nextInt();// 1번부터 시작해버렸다
		int E = sc.nextInt();

		int[][] adjArr = new int[V + 1][V + 1]; // 인접행렬
		int[] inDegree = new int[V + 1]; // 진입차수를 저장할 배열(선행 과제의 개수)

		for (int i = 0; i < E; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			adjArr[from][to] = 1; //유향 그래프 입력
			inDegree[to]++;        //진입차수를 1증가
		}//입력 완료
		
		Queue<Integer> q = new LinkedList<>();
		
		//1. 시작 -> 진입차수가 0인 정점을 죄다 넣어라
		for(int i = 1; i<V+1; i++) {
			if(inDegree[i] == 0)
				q.add(i);
		}
		
		//2. 큐가 공백이 될때까지 돌려!
		while(!q.isEmpty()) {
			int curr = q.poll(); //하나꺼내
			//작업해
			System.out.println(cook[curr]);
			
			//curr 인접한 정점을 순회하면서 간선을 제거한다.
			for(int to = 1; to<V+1; to++) {
				//인접행렬이라서.. 연결 되어 있니?
				if(adjArr[curr][to] == 1) {
					inDegree[to]--;
					//필요시 간선을 진짜로 제거할 수도 있다.
					adjArr[curr][to] = 0;
					//선행 과제를 마무리 했다
					if(inDegree[to] == 0) {
						q.add(to);
					}
				}
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	static String input = "9 9\r\n" + "1 4\r\n" + "1 8\r\n" + "2 3\r\n" + "4 3\r\n" + "8 5\r\n" + "3 5\r\n" + "5 6\r\n"
			+ "9 6\r\n" + "6 7\r\n" + "";
}
