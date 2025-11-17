package livememo.com.ssafy.day9;

import java.io.Serializable;

public class Person implements Serializable{
	/**
	 * 
	 */
//	private static final long serialVersionUID = 6325417938207494522L;
	/**
	 * 아래 상수는 only test만...
	 */
//	private static final long serialVersionUID = 10_000_000_000L;
//	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	
	public Person() {

	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	

}
