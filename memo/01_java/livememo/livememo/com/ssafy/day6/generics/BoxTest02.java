package livememo.com.ssafy.day6.generics;

import java.util.ArrayList;
import java.util.List;

public class BoxTest02 {
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.setOb("Hello!");
		System.out.println(box.getOb());
		
		//기초자료형은 넣을 수 없다
//		Box<int> intBox = new Box<>();
//		Wrapper클래스 활용(참조형 버전)
		Box<Integer> intBox = new Box<>();
		
		Box<Object> box1 = new Box<>();
		
//		int -> Integer 
//		char -> Character
//		boolean -> Boolean
//		double -> Double
		int i1 = 11;		//객체x
		Integer i2 = 11;	//객체o -> AutoBoxing
		Integer i3 = Integer.valueOf(11);	//객체o -> Boxing
		int i4 = i3;		//객체x -> AutoUnboxing
		int i5 = i3.intValue();		//객체x -> Unboxing
		
		box.printClassName("hi");
		box.printClassName(1.5);
		box.printClassName(12);
		box.printClassName(true);
		
		box1.printClassName(151);
		
		
	}
}

class Box<T> {
	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
	
	public <A> void printClassName(A item) {
		System.out.println(item.getClass().getName());
	}
}
