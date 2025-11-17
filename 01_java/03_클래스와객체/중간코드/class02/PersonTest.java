package class02;

public class PersonTest {
	public static void main(String[] args) {
		//Yang을 생성해보자!
		//클래스이름 변수이름 = new 클래스이름();
		Person yang = new Person();
		
		yang.name = "Yang";
		yang.age = 45;
		yang.hobby = "Youtube";
		
		System.out.printf("나의 이름은 %s입니다. %n나이는 %d세, 취미는%s입니다.%n", yang.name, yang.age, yang.hobby);
		
		
		
		Person hong = new Person();
		hong.name = "Hong";
		hong.age = 25;
		hong.hobby = "Golf";
		System.out.printf("나의 이름은 %s입니다. %n나이는 %d세, 취미는%s입니다.%n", hong.name, hong.age, hong.hobby);
		
		info(yang.name, yang.age, yang.hobby);
		info(hong.name, hong.age, hong.hobby);
	}
	
	public static void info(String name, int age, String hobby) {
		System.out.printf("나의 이름은 %s입니다. %n나이는 %d세, 취미는%s입니다.%n", name, age, hobby);
	}
	
	
	
	
	
	
	
	
	
	
	
}
