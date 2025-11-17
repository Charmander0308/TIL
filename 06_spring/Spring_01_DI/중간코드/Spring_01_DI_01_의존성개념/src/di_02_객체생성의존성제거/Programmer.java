package di_02_객체생성의존성제거;

public class Programmer {
	private String name;
	private int age;
	//요게 핵심
	private Desktop desktop;
	
	//생성한다 -> 고용한다
	//객체생성 의존성을 제거를 하겠다.
	public Programmer(Desktop desktop) {
		this.desktop = desktop; 
	}
	
	public void coding() {
		System.out.println(desktop.getInfo()+"으로 개발을 합니다.");
	}
}
