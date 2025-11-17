package com.ssafy.map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Map03_TreeMap {
	public static void main(String[] args) {
		NavigableMap<Integer, String> map = new TreeMap<>();
		map.put(30, "삼십");
		map.put(10, "십");
		map.put(20, "이십");
		map.put(40, "불혹");
		
		System.out.println(map); //Key를 이용하여 정렬 끝
		System.out.println(map.firstKey());
		System.out.println(map.lastEntry());
		System.out.println(map.lowerKey(20)); //미만
		System.out.println(map.ceilingKey(30));
		
		System.out.println(map.descendingKeySet());
	}
}
