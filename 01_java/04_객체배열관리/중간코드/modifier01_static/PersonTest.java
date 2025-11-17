package modifier01_static;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person();
		
		System.out.println(p.pCount++);
		
		Person p2 = new Person();
		System.out.println(p2.pCount);
		
		System.out.println(Person.pCount);
		
		p.eat();
		
		p.study();
		Person.study();
		
		
		
		
		
		
		
		
//		add(1,2);
		
//		PersonTest pt = new PersonTest();
//		pt.add(0, 0);
	}
	
//	public int add(int a, int b) {
//		return a+b;
//	}
}
