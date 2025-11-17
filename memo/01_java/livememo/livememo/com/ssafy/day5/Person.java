package livememo.com.ssafy.day5;

public class Person {
	static int pCount;
	
	String name;
	int age;
	String hobby;
	
	static {
		System.out.println("클래스가 로드될 때 한번 호출");
		pCount = 10;
	}
	
	{
		System.out.println("인스턴스가 생성될 때마다 호출");
	}
	
	public void eat() {
		System.out.println("yammy");
	}
	

	
}
