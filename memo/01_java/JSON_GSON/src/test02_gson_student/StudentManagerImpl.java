package test02_gson_student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

//싱글턴패턴 수정해보자!
public class StudentManagerImpl implements StudentManager {

	// 학생들 목록을 관리하자!
	// 1. 배열(고정된 길이)
	// 2. 리스트(동적 길이)
	// 2-1. ArrayList : 장/단
	// 2-2. LinkedList : 장/단
	private List<Student> studentList = new ArrayList<>();

	private File file = new File("data/student.json");
	private Gson gson = new Gson(); 

	// 나라도 생성하자
	private static StudentManager manager;

	// 외부에서 생성할수 없게 되었다!
	private StudentManagerImpl() {
		loadData();
	}

	// 가져다 쓰세요!
	public static StudentManager getManager() {
		if (manager == null) {
			manager = new StudentManagerImpl();
		}
		return manager;
	}

	@Override
	public boolean add(Student student) {
		// 배열이었다면...
		// size의 자리에 넣고 size++; -> 길이를 벗어나지 않았는지... 쳌
		// 100명정도만 관리할래!
		if (studentList.size() > 100) {
			System.out.println("더이상 기억할 수 없어요!");
			return false;
		}
		//////////////////////////////////////
		// 추후 고려 포인트 student 객체는 완벽한가? -> 믿어야함.
		// 유효성 검사! -> 모든 필드가 완벽하게 작성이 되어있는지 유효한지! 등을 체크
		studentList.add(student); // 길이 확인을 하지 않아도 괜찮나?!
		return true;
	}

	@Override
	public List<Student> getAll() {
		// 배열로 했다면...
		// 실제 있는 크기만큼 -> 새로운 배열을 생성하고 복사해서 반환한다!
		return studentList;
	}

	@Override
	public Student getStudent(int studentId) {
		for (int i = 0; i < studentList.size(); i++) {
			Student tmp = studentList.get(i);
			if (tmp.getStudentId() == studentId) {
				return tmp;
			}
		}

		for (Student st : studentList) {
			if (st.getStudentId() == studentId)
				return st;
		}
		return null;
	}

	// 해당 코드는 일치해야만 가져온다.
	// 일부 포함 검색이라면 어떻게 해야할지... 작성해보세요~~
	@Override
	public List<Student> searchName(String name) {
		List<Student> tmp = new ArrayList<>();
		for (Student st : studentList) {
			if (st.getName().equals(name)) {
				tmp.add(st);
			}
		}
//		if(tmp.size() == 0) return null;
		return tmp;
	}

	@Override
	public void update(Student student) throws StudentNotFoundException {
		// student 인스턴스가 가지고 있는 인간을 가지고 와야한다.
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getStudentId() == student.getStudentId()) {
				studentList.set(i, student);
				return;
			}
		}
		throw new StudentNotFoundException(student.getStudentId());
	}

	@Override
	public boolean delete(int studentId) {
//		for(int i=0; i<studentList.size(); i++) {
//			
//			//일치하면 지워! 하나지울떄는 상관 없다
//			//여러개 지울떄는 거꾸로 도는 경우가 많다!
//		}
		// 서울16반 정대철 명예!
		for (int i = studentList.size() - 1; i >= 0; i--) {
			if (studentList.get(i).getStudentId() == studentId) {
				studentList.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public void saveData() {
		// 저장을 한다! -> 프로그램에서 파일로 내보는 것!
		// 죄다 문자야! -> Reader 써도 될지도? FileReader OK?
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));) {
			bw.write(gson.toJson(studentList));
			System.out.println("저장완료");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

//	@Override
	public void loadData() {
		if (file.exists()) {
			try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));) {
				String line = br.readLine();
				Type studentListType = new TypeToken<ArrayList<Student>>(){}.getType();
				studentList = gson.fromJson(line, studentListType);
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
