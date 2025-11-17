package livememo.com.ssafy.day6.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {
	public static void main(String[] args) {
//		Set<Integer> hash1 = new HashSet<>();
//		Set<Integer> hash2 = new HashSet<>();
//		for(int i = 0; i < 10000; i++) {
//			hash1.add(i+1);
//			hash2.add(i+1);
//		}
//		System.out.println(hash1.contains(3));
//		System.out.println(hash1.contains(13));
//		System.out.println(hash1);
//		System.out.println(hash2);
//		hash1.add(10000);
//		System.out.println(hash1);
//		Set<Integer> set = new TreeSet<>();
		NavigableSet<Integer> set = new TreeSet<>();
		
		set.add(10);
		set.add(25);
		set.add(150);
		set.add(15);
		set.add(30);
		System.out.println(set);
		
		System.out.println(set.first());
		System.out.println(set.last());		
		System.out.println(set.lower(30));	//30미만 가장 큰 값
		System.out.println(set.floor(30));	//30이하 가장 큰 값
		System.out.println(set.ceiling(30));	//30이상 가장 작은 값
		System.out.println(set.higher(30));	//30초과 가장 작은 값
		System.out.println(set.descendingSet());	//내림차순
		System.out.println(Arrays.toString(set.toArray()));		//set을 배열로 리턴해줌
		
		
		
	}
}
