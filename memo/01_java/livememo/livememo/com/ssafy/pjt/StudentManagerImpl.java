package livememo.com.ssafy.pjt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class StudentManagerImpl implements StudentManager{
	
	//학생들 목록을 관리하자
	//1. 배열(고정된 길이)
	//2. 리스트(동적 길이)
	//2-1. ArrayList	: 장/단
	//2-2. LinkedList	: 장/단
	
	File file = new File("");
	
	private List<Student> studentList = new ArrayList<>();
	
	//2. 나라도 생성하자
	private static StudentManager manager = new StudentManagerImpl();
	
	//1. 외부에서 생성할 수 없게 되었다!
	private StudentManagerImpl() {
		
	}
	//3.가져다 쓰세요!
	public static StudentManager getManager() {
		return manager;
	}
	
	@Override
	public boolean add(Student student) {
		//배열이었다면...
		//size의 자리에 넣고 size++; -> 길이를 벗어나지 않았는지 체크
		//100명 정도만 관리할래!
		if(studentList.size() > 100) {
			System.out.println("더 이상 기억할 수 없어요");
			return false;
		}
		
		//나중에 생각할 것 : student 객체는 완벽한가? -> 믿어야함
		//유효성 검사 : 모든 필드가 완벽하게 작성이 되어있는지, 유효한지 등을 체크
		studentList.add(student);
		return true;
	}

	@Override
	public List<Student> getAll() {
		//배열로 했다면..
		//실제 있는 크기만큼 새로운 배열을 생성하고 복사해서 반환한다!
		return studentList;
	}

	@Override
	public Student getStudent(int studentId) {
		for(int i = 0; i <studentList.size(); i++) {
			Student tmp = studentList.get(i);
			if(tmp.getStudentId() == studentId) {
				return tmp;
			}
		}
		return null;
	}

	@Override
	public List<Student> searchName(String name) {
		List<Student> tmp = new ArrayList<>();
		for(Student s : studentList) {
			if(s.getName().equals(name)) {
				tmp.add(s);
			}
		}
		return tmp;
	}

	@Override
	public void update(Student student) {
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getStudentId() == student.getStudentId()) {
				studentList.set(i, student);
			}
		}
		
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void saveData() {
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)))){
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	@Override
	public void loadData() {
		// TODO Auto-generated method stub
		
	}

}
