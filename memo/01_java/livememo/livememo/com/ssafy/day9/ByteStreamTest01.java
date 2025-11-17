package livememo.com.ssafy.day9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTest01 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("dog.txt");
			fos = new FileOutputStream("dog-copy.txt");
			
			int b;
			
			while((b = fis.read()) != -1) {
				fos.write(b);
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일 없음 이슈");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("통로 이슈");
		} finally {
			//통로를 닫아야 한다. -> 지금은 기능이 별로 없어서 코드 돌고 멈춤,,,,,
			try {
				if(fis != null) {
					fis.close();
				}
				if(fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}
