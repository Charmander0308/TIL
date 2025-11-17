package com.ssafy.list;

//Ctrl + Shift + O(영어) 자동임포트
import java.util.ArrayList;
import java.util.List;

//import java.util.*;


public class List01_ArrayList {
	public static void main(String[] args) {
//		List : 순서 O / 중복 O
		
//		ArrayList<String> names = new ArrayList<String>();
//		ArrayList<String> names = new ArrayList<>();
		
		List<String> names = new ArrayList<>();
		
		//원소추가
		names.add("유승준");
		names.add("윤정아");
		names.add("윤정아");
		
		for(String name : names) {
			System.out.println(name);
		}
		System.out.println("-------------------------");
		
		for(int i = 0 ; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println(names);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
