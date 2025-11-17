package class4;

public class Dog {
	
	String name;
	int age;
	String size;
	
	public Dog() {
		System.out.println("기본 생성자 생성");
	}

	public Dog(String name, int age) {
		this();
		this.name = name;
		this.age = age;
		System.out.println("2번 생성자 생성");
	}

	public Dog(String name, int age, String size) {
		this(name, age);
		this.size = size;
		System.out.println("3번 생성자 생성");
	}
	
	
	
	
}
