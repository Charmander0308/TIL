package test02_gson_student;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		StudentManager mgr = StudentManagerImpl.getManager();
		Scanner sc = new Scanner(System.in);
		
//		for(Student st : mgr.getAll()) {
//			System.out.println(st);
//		}
		
		int sel;
		do {
			System.out.println("학생 관리 프로그램(번호를 입력해주세요)");
			System.out.println("1. 학생 등록");
			System.out.println("2. 학생 전체 조회");
			System.out.println("3. 학생 수정");
			
			sel = sc.nextInt();
			System.out.println("--------------------------------");
			
			if(sel == 1) {
				System.out.println("학생을 등록하겠습니다.");
				System.out.println("이름 : ");
				String name = sc.next();
				System.out.println("전공 : ");
				String major = sc.next();
				System.out.println("트랙 : ");
				String track = sc.next();
				mgr.add(new Student(name, major, track));
			} else if(sel == 2) {
				
			} else if(sel == 3) {
				
			}
			
			
			
		} while (sel != 0);
		
		
	}

}
