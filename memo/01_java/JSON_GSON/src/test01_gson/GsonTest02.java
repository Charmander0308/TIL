package test01_gson;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class GsonTest02 {
	//
	public static void main(String[] args) {
		Gson gson = new Gson();
		
		Student st1 = new Student("양띵균", "컴퓨터공학", "자바비전공");
		Student st2 = new Student("김철수", "수학과", "자바비전공");
		Student st3 = new Student("최민수", "경영학과", "자바비전공");
		Student st4 = new Student("박찬호", "호텔조리학과", "자바비전공");
		
		//여러개의 객체를 저장하는 방법은 2가지 정도
		//1.객체배열
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
		
		
		//2.객체리스트
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
