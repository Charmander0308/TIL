package di_02_객체생성의존성제거;

public class Programmer {
	private String name;
	private int age;
	
	private Desktop desktop;
	
	//객체생성 의존성 제거를 하겠다.
	public Programmer(Desktop desktop) {
		this.desktop = desktop;
	}
	
	public void coding() {
		System.out.println(desktop.getInfo() + "으로 개발을 합니다.");
	}
	
	
}
