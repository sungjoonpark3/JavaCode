package Chapter6Test;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee= new Student(1001,"Lee");
		
		studentLee.addBook("����", "������");
		studentLee.showStudentInfo();
		
		Student studenKim = new Student(1002,"Kim");
		studenKim.addBook("¯���¸�����2", "�Ϻ���");
		studenKim.showStudentInfo();
		
		
		Book books=new Book("�����","�����2");
		books.showBookInfo();
	}

}
