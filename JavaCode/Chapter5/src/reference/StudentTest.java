package reference;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(100,"lee");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubjcet("수학", 90);
		
		studentLee.showStudentScore();
		
		

	}

}
