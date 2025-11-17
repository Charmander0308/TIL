package test01_gson;

import com.google.gson.Gson;

public class GsonTest01 {
	//
	public static void main(String[] args) {
		Gson gson = new Gson();
		
		Student st = new Student("양띵균", "컴공", "자바비전공");
		System.out.println(st);
		
		String stJson = gson.toJson(st);
		System.out.println(stJson);
		
		//Json을 Student로 바꾸자
		Student st2 = gson.fromJson(stJson, Student.class);
		System.out.println(st2);
		
		
	}

}
