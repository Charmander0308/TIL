package class2;

public class Person {
	String name;
	int age;
	String hobby;

	void study(int time) {
		System.out.println(time + "시간만큼 공부를 했습니다.");
	}
	
	@Override
	public String toString() {
		return "[이름 : " + name + ", 나이 : " + age + ", 취미 : " + hobby + "]";
	}
}
