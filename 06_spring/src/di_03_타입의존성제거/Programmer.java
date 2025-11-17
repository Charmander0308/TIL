package di_03_타입의존성제거;

public class Programmer {
	private String name;
	private int age;
	
	//느슨한 결합을 했다.
	private Computer computer;
	
	//객체생성 의존성 제거를 하겠다.
	public Programmer(Computer computer) {
		this.computer = computer;
	}
	
	public void coding() {
		System.out.println(computer.getInfo() + "으로 개발을 합니다.");
	}
	
	
}
