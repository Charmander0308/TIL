import java.util.Comparator;
import java.util.PriorityQueue;

//나와 얘
//class Person implements Comparable<Person>{
//	String name;
//	int age;
//	
//	public Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//
//	
//	//나이순으로 정렬을 할거야 (오름차순으로)
//	@Override
//	public int compareTo(Person o) {
//		//오름차순으로 정렬이 된다~!
//		return this.age - o.age;
//	}
//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", age=" + age + "]";
//	}
//}
//나와 얘
class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

public class Heap03_PersonPQ {
	public static void main(String[] args) {
		
//		PriorityQueue<String> tmp = new PriorityQueue<>();
//		PriorityQueue<Person> pq = new PriorityQueue<>();
//		PriorityQueue<Person> pq = new PriorityQueue<>(new NameComparator());
		
		//1회 한정 익명클래스 정의~~
		PriorityQueue<Person> pq = new PriorityQueue<>(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				//나이순(내림차순)-> 같다면 이름 오름차순으로 정렬
				if(o1.age == o2.age) {
					return o1.name.compareTo(o2.name);
				}
				return o2.age - o1.age;
			}
		});
		
	
		pq.add(new Person("최현진", 28));
		pq.add(new Person("이서연", 10));
		pq.add(new Person("양띵균", 45));
		pq.add(new Person("현진혁", 45));
		
		System.out.println(pq.poll());
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
