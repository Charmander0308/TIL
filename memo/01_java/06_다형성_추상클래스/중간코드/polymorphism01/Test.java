package polymorphism01;

public class Test {
	public static void main(String[] args) {
		Student st = new Student();
		Person p = new Student();
		Object obj = new Person();
		
//		Student st2 = new Person();
		
		
		//묵시적 형변환
		p = st; //자식->부모로 캐스팅 할때는 문제없다!
		obj = p;
		
		//명시적 형변환
		Person person = new Person();
		Student student = (Student)person; //부모->자식으로 캐스팅할때는 문제발생
		
		student.study();
		
		
		Person person2 = new Student();
		Student student2 = (Student)person2;		   //에러 날까? 안날까?
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
