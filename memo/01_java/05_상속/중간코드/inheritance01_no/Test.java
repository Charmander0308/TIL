package inheritance01_no;

public class Test {
	public static void main(String[] args) {
		Person p = new Person(); //기본생성자를 컴파일러가 알아서 추가를 해줘서..
		Student st = new Student();
		
		//서로 연관이 없다. 비슷하기만 할뿐 남남이야
		p.eat();
		st.eat();
	}
}
