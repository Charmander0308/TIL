import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue04_마이쮸시뮬레이션 {
	static class Person {
		static int pNumber = 1;
		int num; //사람의 번호
		int cnt; //가져갈 수 있는 마이쮸의 개수
		
		public Person() {
			this.num = pNumber++;
			this.cnt = 1;
		}
		
		public Person(int num) {
			this.num = num;
			this.cnt = 1;
		}
		
		public Person(int num, int cnt) {
			this.num = num;
			this.cnt = cnt;
		}
		@Override
		public String toString() {
			return "Person [num=" + num + ", cnt=" + cnt + "]";
		}
		
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int ans = 0;
			int N = sc.nextInt(); //이번에 나누어줄 마이쮸의 양
			int pNum = 1;
			//Q를 통해서 관리를 하겠다.
			//1. 사람의번호
			//2. 가져갈 수 있는 마이쮸의 개수
			//두개의 정보는 정수(int형)
//			Queue<int[]> q = new LinkedList<>();
			Queue<Person> q = new LinkedList<>();
			
//			q.offer(new Person());
			q.offer(new Person(pNum++));
//			q.offer(new Person(pNum++, 1));
			
			while(N > 0) {
				Person p = q.poll();
//				System.out.println(N+"개 남음");
//				System.out.println(p);
				N -= p.cnt;
				if( N <= 0) {
					//마지막 마이쮸까지 탈탈털어서 다 줘버렸다.!
					ans = p.num;
					System.out.println(p.cnt);
					break;
				}
				//줄 다시 서야되니까!
//				p.cnt++;
//				q.offer(p); //p 새로 생성한건가?
				q.offer(new Person(p.num, p.cnt+1)); //p 새로 생성한건가?
				//////////////////////////////////
				//새로운 사람이 와서 줄을 선다!
				q.offer(new Person(pNum++));
			}//나누어주기 끝
			System.out.println("#"+tc + " "+ans);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} // tc
	}// main
}
