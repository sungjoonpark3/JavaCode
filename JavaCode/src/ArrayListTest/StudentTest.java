package ArrayListTest;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(1001,"lee");
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 90);
		studentLee.addSubject("��ȸ", 80);
		
		Student studentKim = new Student(1002,"Kim");
		studentKim.addSubject("����", 100);
		studentKim.addSubject("����", 80);
		studentKim.addSubject("����", 70);
		
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
	}

}
