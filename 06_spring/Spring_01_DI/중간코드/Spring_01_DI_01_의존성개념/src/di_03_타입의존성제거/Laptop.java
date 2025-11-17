package di_03_타입의존성제거;

public class Laptop implements Computer{
	private String CPU;
	private String RAM;
	private String SSD;
	private String GPU;
	
	//설정자,접근자 
	//생성자
	
	public String getInfo() {
		return "랩톱";
	}
	
}
