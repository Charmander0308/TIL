package livememo.com.ssafy.day7.map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMap03 {
	public static void main(String[] args) {
		NavigableMap<Integer, String> map = new TreeMap<>();
		map.put(30, "삼십");
		map.put(10, "십");
		map.put(20, "이십");
		map.put(40, "불혹");
		
		System.out.println(map);
		System.out.println(map.firstKey());
		System.out.println(map.firstEntry());
		System.out.println(map.values());
		System.out.println(map.lastKey());
		System.out.println(map.lastEntry());
		System.out.println(map.lowerKey(20));
		System.out.println(map.lowerEntry(20));
		System.out.println(map.ceilingKey(30));
		System.out.println(map.ceilingEntry(30));
		System.out.println(map.descendingMap());
		System.out.println(map.descendingKeySet());
	}

}
