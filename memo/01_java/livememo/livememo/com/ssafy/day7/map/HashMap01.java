package livememo.com.ssafy.day7.map;

import java.util.Map;
import java.util.HashMap;

public class HashMap01 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("김싸피", "Java");
		map.put("이싸피", "C++");
		map.put("박싸피", "Python");
		map.put("최싸피", "C");
		map.put("정싸피", "Ruby");
		System.out.println(map);
		System.out.println(map.keySet());
		for(String key : map.keySet()) {
			System.out.println(map.get(key));
		}
		System.out.println(map.get("정싸피"));
		System.out.println(map.entrySet());
		System.out.println(map.containsKey("박싸피"));
		System.out.println(map.containsValue("C"));
				
		
	}

}
