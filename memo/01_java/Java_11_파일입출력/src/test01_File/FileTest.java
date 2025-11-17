package test01_File;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		//File 클래스 : 파일 & 폴더(디렉토리) 관리하기 위한 클래스
//		File file = new File("dog.jpg");
		File file = new File("C:\\java_workspace\\Java_11_파일입출력\\dog.jpg");
		
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		
		System.out.println(file.isAbsolute()); //절대경로는 아니군...
		System.out.println(file.getAbsolutePath()); //절대경로를 반환
		
		
//		File src = new File("src");
		
		File folder = new File("folder"); //이름이 폴더인 디렉토리를 생성한건가?
		System.out.println(folder.exists());
		folder.mkdir();
		System.out.println(folder.exists());
		
		//파일 생성할수도 있꼬 / 폴더를 생성하고 관리할수도 있따.!
		
		
		
		
		
		
		
	}
}
