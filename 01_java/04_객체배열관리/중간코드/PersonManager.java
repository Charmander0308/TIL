package com.ssafy.pjt;

//딱 1개만 만들어지도록 -> 싱글턴 패턴을 적용해보자!
public class PersonManager {
	
	int size = 0; //이것의 용도는?
	private Person[] arr = new Person[100];
	
	//1번 : 외부에서 생성하지 못하도록 막아야한다!
	private PersonManager() {
	}
	
	//2번 : 외부에서 생성하지 못하니 내가 생성해서 가지고 있자!
	//4번 : 얘네도 미리 메모리에 올려두자!
	private static PersonManager manager = new PersonManager();
	
	//3번 : 내가 만든 Manager를 외부에서 쓸 수 있게 해줘잉!(접근자)
	//3-1번 : 그런데 외부에서 인스턴스를 만들 수는 없다! -> static 키워드를 통해 미리 메모리에 올리자
	public static PersonManager getManager() {
		return manager;
	}
		

	
}
