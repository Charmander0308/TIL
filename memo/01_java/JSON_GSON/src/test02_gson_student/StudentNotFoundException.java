package test02_gson_student;

public class StudentNotFoundException extends Exception{
	
	public StudentNotFoundException(int studentId) {
		super(studentId +"라는 학번을 가진 사람은 없습니다.");
	}
}
