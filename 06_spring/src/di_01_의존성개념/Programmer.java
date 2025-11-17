package di_01_의존성개념;

public class Programmer {
	private String name;
	private int age;
	
	private Desktop desktop;

	public Programmer() {
		this.desktop = new Desktop();
	}
	
	public void coding() {
		System.out.println(desktop.getInfo() + "으로 개발을 합니다.");
	}
	
	
}
