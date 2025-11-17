package com.ssafy.pjt;

import java.util.List;

//인터페이스 -> 완벽히 추상화된 설계도
public interface StudentManager {
	//필드는 전부다 상수 -> public static final 생략 있다!
	
	//메서드(CRUD)
	//등록
	public abstract boolean add(Student student);
	//조회(전체, 상세, 검색 )
	public abstract List<Student> getAll();
	public abstract Student getStudent(int studentId);
	//검색 시 이름이 중복되나? 고려하면 배열/리스트든 골라서 쓸 수 있음
	public abstract List<Student> searchName(String name); //반환타입
	//수정
	public abstract void update(Student student);
	//삭제
	public abstract boolean delete(int studentId);
	
}
