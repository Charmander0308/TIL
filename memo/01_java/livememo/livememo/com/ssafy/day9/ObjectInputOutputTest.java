package livememo.com.ssafy.day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputTest {
	public static void main(String[] args) {
		Person p = new Person("Kim", 40);
		
		//실제로 파일로 저장을 해보자!
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"));
				) {
			oos.writeObject(p);
		} catch(Exception e) {
			e.printStackTrace();
		}
		//실제로 파일을 읽어서 객체로 바꾸어보자!
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"));
				) {
			Object obj = ois.readObject();
			System.out.println(obj);	//동적 바인딩에 의해 Person의 toString이 동작을 한 것이다~
		} catch (Exception e){
			e.printStackTrace();
		}
		
		
	}

}
