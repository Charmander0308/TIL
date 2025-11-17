package test01_gson;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

//서울14반 이지원 짱짱명예
public class GsonTest02 {
	//GSON 등록해야 사용이 가능하다
	//1. 직접 추가 (jar를 이용하여 등록)
	//2. maven pjt 등록하는 방법
	public static void main(String[] args) {
		//GSON 얘를 통해서 바꿀꺼야!
		Gson gson = new Gson();
		
		//Java 객체를 JSON 데이터로...
		Student st1 = new Student("양띵균", "컴퓨터공학", "자바비전공");
		Student st2 = new Student("안태리", "불어불문학", "자바비전공");
		Student st3 = new Student("최현진", "국제통상", "자바비전공");
		Student st4 = new Student("박지우", "식품영양학", "자바비전공");
		
		
		//여러개의 객체를 저장하는 방법은 2가지 정도
		//1. 객체배열
		Student[] sArr = new Student[4];
		sArr[0] = st1;
		sArr[1] = st2;
		sArr[2] = st3;
		sArr[3] = st4;
		
		//객체배열 -> JSON
		String arrStr = gson.toJson(sArr);
		System.out.println(arrStr);
		//JSON -> 객체배열
		Student[] sArr2 = gson.fromJson(arrStr, Student[].class);
		for(Student s : sArr2) {
			System.out.println(s);
		}
		
		
		
		//2. 객체리스트
		List<Student> sList = new ArrayList<>();
		sList.add(st1);
		sList.add(st2);
		sList.add(st3);
		sList.add(st4);
		//객체리스트 -> JSON
		String listStr = gson.toJson(sList);
		System.out.println(listStr);
		//JSON -> 객체리스트
		Type studentListType = new TypeToken<ArrayList<Student>>(){}.getType();
		ArrayList<Student> sList2 = gson.fromJson(listStr, studentListType);
		for(Student st : sList2) {
			System.out.println(st);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
