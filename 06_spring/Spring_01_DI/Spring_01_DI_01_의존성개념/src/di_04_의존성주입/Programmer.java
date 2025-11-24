package di_04_의존성주입;

public class Programmer {
	private String name;
	private int age;
	//요게 핵심 -> 느슨한결합을 했다
	private Computer computer;
	
	public Programmer() {
	}
	
	
	//생성자 주입을 했다!
	public Programmer(Computer computer) {
		this.computer = computer; 
	}
	
	
	//설정자 주입을 했다!
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	
	//메서드 주입을 했다(여러개를 동시에 넣을 수 있음)
	
	
	
	
	
	
	
	public void coding() {
		System.out.println(computer.getInfo()+"으로 개발을 합니다.");
	}
}
