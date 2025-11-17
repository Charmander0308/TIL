package livememo.com.ssafy.day9;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		//File 클래스 : 파일 & 폴더(디렉토리) 관리하기 위한 클래스
		File file = new File("C:\\Users\\SSAFY\\Desktop\\라이브\\live\\livememo\\dog.txt");
		
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		
		System.out.println(file.isAbsolute());
		System.out.println(file.getAbsolutePath());
		
		File folder = new File("folder");	//객체만 생성된 상태
		System.out.println(folder.exists());	//false
		folder.mkdir();							//경로에 생성
		System.out.println(folder.exists());	//true
		
	}
}
