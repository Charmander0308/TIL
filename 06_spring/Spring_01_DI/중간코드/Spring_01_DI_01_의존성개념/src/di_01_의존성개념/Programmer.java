package di_01_의존성개념;

public class Programmer {
	private String name;
	private int age;
	//요게 핵심
	private Desktop desktop;
	
	//생성한다 -> 고용한다
	public Programmer() {
		this.desktop = new Desktop(); //컴퓨터하나 사준다.
	}
	
	public void coding() {
		System.out.println(desktop.getInfo()+"으로 개발을 합니다.");
	}
}
