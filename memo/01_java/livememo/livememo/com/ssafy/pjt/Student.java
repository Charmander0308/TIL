package livememo.com.ssafy.pjt;

import java.io.Serializable;

public class Student implements Serializable, Comparable<Student> {
	
	private static final long serialVersionUID = 1L;
	private static int autoIncreaseId = 1;
	private int studentId;
	private String name;
	private String major;
	private String track;
	
	public Student() {
		
	}

	public Student(String name, String major, String track) {
		this.studentId = autoIncreaseId++;
		this.name = name;
		this.major = major;
		this.track = track;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getTrack() {
		return track;
	}

	public void setTrack(String track) {
		this.track = track;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", major=" + major + ", track=" + track + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.studentId - o.studentId;
	}
	

}
