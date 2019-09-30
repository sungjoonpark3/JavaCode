package array;

import java.util.ArrayList;

public class Student {
	
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(int studentID,String studentName) {
		this.studentID=studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name,int score) { 
		//생성자를 서브젝트 객체에 생성해서 아래와 같이 사용 한다.
		//	public Subject(String name, int score) {
		//		this.name = name;
		//		this.score = score;
		//	}
		Subject subject = new Subject(name,score);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject subject:subjectList) {
			total += subject.getScore();
			System.out.println(studentName+"학생의 "+subject.getName()+
							   "과목의 성적은"+subject.getScore()+"점입니다.");
			
		}
		System.out.println(studentName+"학생의 총점은"+total+"점입니다.");
	}
	

	
}
