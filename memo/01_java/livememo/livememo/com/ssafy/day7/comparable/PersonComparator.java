package livememo.com.ssafy.day7.comparable;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
	
	//문자열을 비교하고싶어
	// 나이순으로 정렬하고, 같으면 이름순으로 정렬해
	@Override
	public int compare(Person o1, Person o2) {
		if(o1.age == o2.age) {
			return o1.name.compareTo(o2.name);
		}
		return o1.age - o2.age;
	}

}
