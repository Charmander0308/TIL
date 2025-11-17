import java.util.Random;

public class SsafyRoutine {
	public static void main(String[] args) {
		System.out.println("아침에 일어난다.");
		move("교육장", "셔틀버스");
		boolean homework = education();
		move("집", "어디로든 문");
		if(homework) {
			System.out.println("과제를 해결한다.");
		}
		System.out.println("잠을 잔다.");
	}
	
//	public static void education() {
//		System.out.println("오전 수업(Live)을 듣는다.");
//		System.out.println("점심을 먹는다.");
//		System.out.println("오후 수업(실습)을 진행한다.");
//	}

	public static boolean education() {
		System.out.println("오전 수업(Live)을 듣는다.");
		System.out.println("점심을 먹는다.");
		System.out.println("오후 수업(실습)을 진행한다.");
		return new Random().nextBoolean();
	}
	
	public static void move(String place, String transportation) {
		System.out.println(place + "으로 " + transportation + "을(를) 이용하여 이동한다.");
	}
}
