package livememo.com.ssafy.day9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferTest {
	public static void main(String[] args) {
		method1();
		method2();
		
		
		
	}
	
	public static void method1() {
		try(FileReader reader = new FileReader("big_input.txt");
				FileWriter writer = new FileWriter("big_input_copy1.txt") ) {
			long start = System.nanoTime();
			int c;	//byte를 담을 손
			while((c = reader.read())!= -1) {
//				System.out.println(c);
				writer.write(c);
			}
			long end = System.nanoTime();
			System.out.println("보조 스트림 안씀 : " + (end - start));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일 없음 이슈");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("통로 이슈");
		}
	}
	public static void method2() {
		//try with resources: 통로가 try문 끝나면 알아서 close() 호출되도록
		try(BufferedReader br = new BufferedReader(new FileReader("big_input.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("big_input_copy.txt"));
				) {
			long start = System.nanoTime();
			String line;
			while((line = br.readLine()) != null) {
				bw.write(line);
			}
			
			long end = System.nanoTime();
			System.out.println("보조 스트림 추가 : " + (end - start));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일 없음 이슈");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("통로 이슈");
		}
		
		
		
	}
}
