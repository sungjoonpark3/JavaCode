package reference;

public class Student {

	int studentID;
	String studentName;
	
	Subject korea;
	Subject math;
	
	
	public Student(int id , String name) {
		
		studentID = id;
		studentName = name;
		//객체 생성 후 사용하기 
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKoreaSubject(String name,int score) {
		korea.subjectName=name;
		korea.score=score;
	}
	
	public void setMathSubjcet(String name,int score) {
		math.subjectName=name;
		math.score = score;
	}
	
	public void showStudentScore() {
		
		int total = korea.score+math.score;
		System.out.println(studentName+"학생의 총점은"+total+"점입니다.");
	}
	
}
