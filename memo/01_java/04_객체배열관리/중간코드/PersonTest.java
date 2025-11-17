package com.ssafy.pjt;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person("양싸피", 50, 190, "ISTP", false);
		Person p2 = new Person("양싸피", 50, 190, "ISTP", false);
//		
//		System.out.println(p.toString());
		
//		PersonManager mgr1 = new PersonManager();
//		PersonManager mgr2 = new PersonManager();
		PersonManager mgr1 = PersonManager.getManager();
		PersonManager mgr2 = PersonManager.getManager();
		
		System.out.println(1==1); //기초자료형에서는 값을 비교한다!
		System.out.println(mgr1 == mgr2); //참조 주소를 비교한다.
		System.out.println(p == p2);
		
		System.out.println(0.1+0.1+0.1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
