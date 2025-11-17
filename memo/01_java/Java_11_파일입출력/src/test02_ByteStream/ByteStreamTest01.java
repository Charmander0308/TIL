package test02_ByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTest01 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		// 생성자에 File 객체를 넣던지... 문자열로 경로를 넣던지...
		try {
			fis = new FileInputStream("dog.jpg");
			fos = new FileOutputStream("dog-copy.jpg");

			int b; // byte를 담을 손
			while ((b = fis.read()) != -1) {
				fos.write(b);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일 없음 이슈");
		} catch (IOException e) {
			System.out.println("통로 이슈");
		} finally {
			try {
				if(fis != null)
					fis.close();
				if(fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// 통로를 닫아야한다. -> 우리 쪼꼬미는 지금 어차피 기능이 별로없어서.. 멈춘다.
	}
}
