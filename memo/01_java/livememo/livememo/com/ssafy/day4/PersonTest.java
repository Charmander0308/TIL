package livememo.com.ssafy.day4;

import livememo.com.ssafy.day3.Class;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.pCount++);
		
		Person p2 = new Person();
		System.out.println(p2.pCount);
		
		p.eat();
		Person.study();
		
		Class c = new Class();
		c.hello();
		
	}
	
}
