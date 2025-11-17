package com.ssafy.pjt;

import java.util.ArrayList;
import java.util.List;

//싱글턴패턴 수정해보자!
public class StudentManagerImpl implements StudentManager {

	// 학생들 목록을 관리하자!
	// 1. 배열(고정된 길이)
	// 2. 리스트(동적 길이)
	// 2-1. ArrayList : 장/단
	// 2-2. LinkedList : 장/단
	private List<Student> studentList = new ArrayList<>();

	// 나라도 생성하자
	private static StudentManager manager;

	// 외부에서 생성할수 없게 되었다!
	private StudentManagerImpl() {
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
		//추후 고려 포인트 student 객체는 완벽한가? -> 믿어야함.
		//유효성 검사! -> 모든 필드가 완벽하게 작성이 되어있는지 유효한지! 등을 체크
		studentList.add(student); // 길이 확인을 하지 않아도 괜찮나?!
		return true;
	}

	@Override
	public List<Student> getAll() {
		//배열로 했다면... 
		//실제 있는 크기만큼 -> 새로운 배열을 생성하고 복사해서 반환한다!
		return studentList;
	}

	@Override
	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> searchName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean delete(int studentId) {
		// TODO Auto-generated method stub
		return false;
	}

}
