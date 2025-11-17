package com.ssafy.pjt;

public class Test {
	public static void main(String[] args) {
		StudentManager mgr = StudentManagerImpl.getManager();
		
		Student st = new Student(1, "양띵균", "컴퓨터공학", "Java 비전공");
		
		mgr.add(st);
		
		System.out.println(mgr.getAll());
		
	}
}
