package di_03_타입의존성제거;

public class Test {
	public static void main(String[] args) {
		//프로그래머가 데스크톱에 대한 의존성을 가지고 있다.
		Desktop desktop = new Desktop();
		
		Laptop laptop = new Laptop();
//		Programmer p = new Programmer(desktop); 
		Programmer p = new Programmer(laptop); 
		
		p.coding();
	}
}
