package test01_gson;

import com.google.gson.Gson;

//서울14반 이지원 짱짱명예
public class GsonTest01 {
	//GSON 등록해야 사용이 가능하다
	//1. 직접 추가 (jar를 이용하여 등록)
	//2. maven pjt 등록하는 방법
	public static void main(String[] args) {
		//GSON 얘를 통해서 바꿀꺼야!
		Gson gson = new Gson();
		
		//Java 객체를 JSON 데이터로...
		Student st = new Student("양띵균", "컴퓨터공학", "자바비전공");
		System.out.println(st);
		
		String stJson = gson.toJson(st);
		System.out.println(stJson);
		
		//다시 JSON 구했어! -> Student 바꾸자
		Student st2 = gson.fromJson(stJson, Student.class);
		System.out.println(st2);
		
		
		
		
		
		
		
	}
}
