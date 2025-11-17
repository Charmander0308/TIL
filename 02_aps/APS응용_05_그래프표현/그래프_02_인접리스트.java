import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 그래프_02_인접리스트 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//V, E 가 주어진다. 
		int V = sc.nextInt(); //정점의 개수 -> 0부터시작인지, 1부터시작인지 문제보고 판단
		int E = sc.nextInt(); //간선의 개수 (두개의 정점이 주어진다. -> 정점의 순서대로 주어진다는 보장은 없다)
		
		//인접리스트로 저장을 하겠다!
//		List<List<Integer>> adjList;
		List<Integer>[] adjList = new ArrayList[V];
		//매우중요!
		for(int i = 0 ; i<V; i++) {
			adjList[i] = new ArrayList<>();
		}//null 방지
		
		
		//간선의 정보를 입력받자
		for(int i = 0 ; i<E; i++) {
			int A = sc.nextInt(); //두개의 정점 정보가 주어진다.
			int B = sc.nextInt(); 
			int W = sc.nextInt(); //간혹 가중치를 줄때도 있다더라! -> 없으면 1 저장
			
			//가중치 W 정보를 저장하고 싶으면?? -> int형만 저장하므로 불가능
			//1. class 정의해서 넣던지
			//2. int[] 넣던지
			adjList[A].add(B); //유향, 무향일때
			adjList[B].add(A); //무향일때
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
	}
}
