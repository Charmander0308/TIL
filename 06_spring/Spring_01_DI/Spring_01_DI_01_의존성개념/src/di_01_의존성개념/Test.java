package di_01_의존성개념;

public class Test {
	public static void main(String[] args) {
		//프로그래머가 데스크톱에 대한 의존성을 가지고 있다.
		Programmer p = new Programmer(); //컴퓨터를 하나 사서 알아서 넣어 줬다.
		
		p.coding();
	}
}
