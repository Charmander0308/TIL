import java.util.Comparator;


//얘와 쟤
public class NameComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.name.compareTo(o2.name);
	}

}
