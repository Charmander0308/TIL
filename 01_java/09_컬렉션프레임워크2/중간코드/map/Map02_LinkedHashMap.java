package com.ssafy.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map02_LinkedHashMap {
	public static void main(String[] args) {
		//Map : 사전 같은 Key-Value 쌍으로 이루어져 있음
		//Key : 중복 X
		//Value : 중복 O
		//순서 : X -> 일부 있는 것들도 있음
		
		Map<String, String> map = new LinkedHashMap<>();
		
		map.put("이지영", "Java");
		map.put("손지민", "Java");
		map.put("최현진", "한국어");
		map.put("양띵균", "0개국어");
		map.put("안태리", null);
		map.put("신희태", null);
//		map.put(null, null);
		map.put(null, "널"); //이것또한 하나의 키로 본다.!
		
		
		//열심히 공부해서 언어하나 익혔다!
		map.put("양띵균", "Python"); //덮어버림
		
		System.out.println(map);
		
		
		System.out.println(map.keySet());
		
		for(String key : map.keySet()) {
			System.out.println(map.get(key));
		}
		System.out.println("----------------------");
		
		System.out.println(map.get("강진석"));
		
		System.out.println(map.containsKey("강진석"));
		System.out.println(map.containsValue("Java"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
