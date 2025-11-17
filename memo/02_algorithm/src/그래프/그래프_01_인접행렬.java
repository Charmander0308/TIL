package 그래프;

import java.util.Scanner;

public class 그래프_01_인접행렬 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//V, E가 주어진다. 
		int V = sc.nextInt();	//정점의 개수 -> 0부터 시작인지, 1부터 시작인지 문제를 보고 판단
		int E = sc.nextInt();	//간선의 개수 (두 개의 정점이 주어진다 -> 정점의 순서대로 주어진다는 보장은 없다)
		
		//인접행렬을 저장하도록 2차원 배열 -> 가중치가 없다면 있/없 boolean? 아니다.
		//가중치가 없다면 1로 생각해서 int 배열로 만들자! (차수 계산도 편함)
		int[][] adjArr = new int[V][V];	//[V][V]의 의미 : 0번 정점부터 시작하는구나.. 1번부터면 V+1로 편하게 하자...
		
		//간선의 정보를 입력받자
		for(int i=0; i<E; i++) {
			int A = sc.nextInt();	//2개의 정점 정보가 주어진다.
			int B = sc.nextInt();
//			int W = sc.nextInt();	//간혹 가중치를 줄 때도 있다더라! -> 없으면 1 저장
			
			adjArr[A][B] = 1;	//유향이든 무향이든 이건 무조건 저장이야~
			//만약 무향이라면..
			adjArr[B][A] = 1;	//이러한 간선이 주어질 수도 있지만.. 없어도 역으로도 저장해야함
			
//			adjArr[A][B] = adjArr[B][A] = W;	//한줄 작성도 가능
			//유향이고, 가중치가 있다면
//			adjArr[sc.nextInt()][sc.nextInt()] = sc.nextInt();	//안익숙하면 비권장(가능은 함)
			
			
		}
		
		
	}

}
