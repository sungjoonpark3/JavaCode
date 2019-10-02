package classpart;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student studentLee = new Student("이순신");
////		studentLee.studentName = "이순신";
//		studentLee.address ="서울";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(100,"경주");
//		studentKim.studentName="김유신";
//		studentKim.address="경주";
		
		studentKim.showStudentInfo();
	}

}
