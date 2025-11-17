package livememo.com.ssafy.day5;

class Parent{
	String x = "Parent";
	
	public String method() {
		return "Parent method";
	}

	@Override
	public String toString() {
		return "Parent [x=" + x + "]";
	}
	
}


class Child extends Parent{
	String x = "Child";
	
	@Override
	public String method() {
		return "Child method";
	}

	@Override
	public String toString() {
		return "Child [x=" + x + "]";
	}
	
}


public class BlindeingTest {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println(p.x);
		System.out.println(c.x);
		
		System.out.println(p.method());
		System.out.println(c.method());
		
		System.out.println(p.hashCode());
		System.out.println(p.toString());
		System.out.println(c.hashCode());
		
	}

}
