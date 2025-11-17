package interface03_method;

public class MyClass2 implements MyInterface1, MyInterface2{

	@Override
	public void method2() {
		//default 메서드가 겹치는 경우
		//구현클래스에서 재작성 해야 한다.!
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

}
