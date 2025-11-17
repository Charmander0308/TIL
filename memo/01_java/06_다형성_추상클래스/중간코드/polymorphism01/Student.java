package polymorphism01;

public class Student extends Person {
	String major;

	public Student() {
		//super(); //Person 기본생성자를 호출!
	}

	public Student(String name, int age, String major) {
		super(name, age);	//Person 생성자 호출!
		this.major = major;
	}

	@Override
	public void eat() {
		System.out.println("지식을 먹는다.");
	}

	public void study() {
		System.out.println("공부를 한다.");
	}

	@Override
	public String toString() {
		return "Student [major=" + major + ", name=" + name + ", age=" + age + "]";
	}

}
