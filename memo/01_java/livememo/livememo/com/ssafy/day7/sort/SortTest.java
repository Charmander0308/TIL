package livememo.com.ssafy.day7.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortTest {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("김");
		names.add("이거");
		names.add("박");
		names.add("최");
		names.add("정");
		names.add("안녕");
//		names.add(12);
		
		System.out.println(names);
		
		Collections.sort(names);
		System.out.println(names);
		
		int[] nums = {4, 6, 7, 14, 3, 2, 9};
		System.out.println(Arrays.toString(nums));
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		
	}

}
