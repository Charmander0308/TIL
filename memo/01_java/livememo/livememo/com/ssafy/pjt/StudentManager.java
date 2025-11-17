package livememo.com.ssafy.pjt;

import java.util.List;

public interface StudentManager {
	//필드는 전부 다 상수 -> public static final 생략 있다!
	
	//메서드(CRUD)
	//등록
	public abstract boolean add(Student student);
	
	//조회(전체, 상세, 검색)
	public abstract List<Student> getAll();
	public abstract Student getStudent(int studentId);
	public abstract List<Student> searchName(String name);	//검색 시 이름이 중복되는지 고려하면 배열/리스트 골라서 쓸 수 있음
	
	//수정
	public abstract void update(Student student);
	
	//삭제
	public abstract boolean delete(int id);
	
	public void saveData();
	public void loadData();

}
