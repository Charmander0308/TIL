package polymorphism01;

class Parent {
	String x = "parent";

	public String method() {
		return "parent method";
	}

	@Override
	public String toString() {
		return "투스트링";
	}

	public static String method2() {
		return "static parent method";
	}
}

class Child extends Parent {
	String x = "child";

	@Override
	public String method() {
		return "child method";
	}

	public static String method2() {
		return "static child method";
	}
}

public class BindingTest {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();

//		System.out.println(p.x);
//		System.out.println(c.x);

		// 시야 제한을 걸어놨는데 둘 다 child method 떴따!
		// 동적 바인딩
//		System.out.println(p.method());
//		System.out.println(c.method());
//		
//		System.out.println(p);
//		
		// static 이 붙으면 동적바인딩과는 거리 좀 있따더라~~
		System.out.println(p.method2());
		System.out.println(c.method2());

		///////////////////////////////////////
		/// 아래의 코드는 출력결과는 같으나 쬐끔 다름.
		System.out.println(p); // obj toString -> 동적바인딩에 의해 p의 toString이 동작함
		System.out.println(p.toString()); // p의 toString 자체를 호출한 것!
		///////////////////////////////////////

	}
}
