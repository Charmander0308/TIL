package livememo.com.ssafy.day6;

public class Main1 {
	public static void main(String[] args) {
		
		Animal a = new Chicken();
		ChickenMethod(a);
		
	}
	
	private static void ChickenMethod(Animal a) {
		a.move();
		a.sound();
	}
}
