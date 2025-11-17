package livememo.com.ssafy.day7.comparable;

public class Person implements Comparable<Person> {
	String name;
	int age;
	
	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(Person o) {
		//나이를 기준으로 정렬
		return this.age - o.age;
	}
	
	
	
}
