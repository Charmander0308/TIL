package modifier01_static;

public class Person {
	
	//클래스 변수(모든 클래스가 공유하는 값)
	static int pCount = 1;
	
	static  {
		System.out.println("클래스가 로드 될때 한번 수행되는 메서드");
	}
	{
		System.out.println("나는 몇번 호출이 될까요?");
	}
	
	
	//인스턴스 변수(객체마다 고유한 값)
	String name;
	int age;
	String hobby;
	
	public void eat() {
		System.out.println("냠냠");
	}
	
	public static void study() {
		
	}
}
