package livememo.com.ssafy.day9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamTest02 {
	public static void main(String[] args) {
		//try with resources: 통로가 try문 끝나면 알아서 close() 호출되도록
		try(FileReader reader = new FileReader("big_input.txt");
				FileWriter writer = new FileWriter("big_input_copy1.txt") ) {
			
			int c;	//byte를 담을 손
			char[] buffer = new char[100];		//바구니를 활용하면 더 빨리 일처리 가능
			while((c = reader.read(buffer))!= -1) {
				System.out.println(c);
				writer.write(c);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일 없음 이슈");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("통로 이슈");
		}
		
		
		
	}
}
