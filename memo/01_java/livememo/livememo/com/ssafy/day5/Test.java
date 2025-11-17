package livememo.com.ssafy.day5;

public class Test {
	public static void main(String[] args) {
//		Person p = new Person();
		Person p = new Student();
		
//		Student st = (Student) p;
		
		if(p instanceof Student) {
			Student st = (Student)p;
			st.study();
		}
		//java 16+
		if(p instanceof Student st) {
			st.study();
		}
		
		
	}

}
