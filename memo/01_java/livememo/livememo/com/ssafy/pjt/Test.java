package livememo.com.ssafy.pjt;

public class Test {
	public static void main(String[] args) {
		StudentManager mgr = StudentManagerImpl.getManager();
		
		Student st1 = new Student("양띵균", "컴퓨터공학", "Java 비전공");
		Student st2 = new Student("양띵균", "컴퓨터공학", "Java 비전공");
		Student st3 = new Student("양띵균", "컴퓨터공학", "Java 비전공");
		Student st4 = new Student("양띵균", "컴퓨터공학", "Java 비전공");
		Student st5 = new Student("양띵균", "컴퓨터공학", "Java 비전공");
		mgr.add(st1);
		mgr.add(st2);
		mgr.add(st3);
		mgr.add(st4);
		mgr.add(st5);
		
		for(Student s : mgr.getAll()) {
			System.out.println(s);
		}
		
		System.out.println(mgr.getStudent(2));
		Student st6 = new Student("양띵균", "경영학", "Java 비전공");
		st6.setStudentId(5);
		mgr.update(st6);
		
		for(Student st : mgr.getAll()) {
			System.out.println(st);
		}
		
		
	}	
}
