package class2;

public class PersonTest {
	public static void main(String[] args) {
		Person yang = new Person();
		yang.name = "yang";
		yang.age = 45;
		yang.hobby = "Youtube";
		
		System.out.println(yang.toString());
		yang.study(100);
		yang.study((byte) 10);
//		yang.study(10L); 	//명시적 형변환은 안됨 -> 매개변수는 자동 형변환을 통해 전달됨
		
		
	}
}
