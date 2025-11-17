package livememo.com.ssafy.day7.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonTest {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		
		list.add(new Person("강", 29));
		list.add(new Person("양", 45));
		list.add(new Person("은혜", 10));
		
		Collections.sort(list);
		
		for(Person p : list) {
			System.out.println(p);
		}
		
		
	}

}
