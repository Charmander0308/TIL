package di_03_타입의존성제거;

public class Test {
	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		Laptop laptop = new Laptop();
		//둘 다 사용할 수 있게 되었다!
//		Programmer p = new Programmer(desktop);
		Programmer p = new Programmer(laptop);
		
		p.coding();
	}
}
