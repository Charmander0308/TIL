package interface01;

//완벽히 추상화된 설계도
public interface MyInterface {
	//추상메서드를 정의했다! (구현부는 ;으로 대체)
	public abstract void method1();
	void method2(); //public abstract 생략되어 있음
	
	//멤버필드? -> 무언가 생략이 되어 있다
	int NUMBER1 = 100;
	public static final int NUMBER2 = 1000; //상수처리
	
}
