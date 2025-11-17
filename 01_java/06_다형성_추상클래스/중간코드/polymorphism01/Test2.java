package polymorphism01;

public class Test2 {
	public static void main(String[] args) {
//		Person p = new Person();
		Person p = new Student();
		
		//아래의 코드는 문법적으로 이슈 없지만 실행시키면 곤란한 코드!
//		Student st = (Student) p;
		
		if(p instanceof Student) {
			Student st = (Student)p;
			st.study();
		}
		
		//java16+ (패턴매칭 방법!)
		if(p instanceof Student st) {
			st.study();
		}
		
	}
}
