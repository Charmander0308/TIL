package interface03_method;

public interface MyInterface2 {
	default void method2() {
		System.out.println("MyInterface2 -> default method");
	}
	
	default void method3() {
		System.out.println("MyInterface2 -> default method3");
	}
}
