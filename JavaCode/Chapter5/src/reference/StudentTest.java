package reference;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(100,"lee");
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubjcet("����", 90);
		
		studentLee.showStudentScore();
		
		

	}

}
