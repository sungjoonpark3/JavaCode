package Chapter6Test;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee= new Student(1001,"Lee");
		
		studentLee.addBook("고향", "조정래");
		studentLee.showStudentInfo();
		
		Student studenKim = new Student(1002,"Kim");
		studenKim.addBook("짱구는못말려2", "일본산");
		studenKim.showStudentInfo();
		
		
		Book books=new Book("가즈아","가즈앙2");
		books.showBookInfo();
	}

}
