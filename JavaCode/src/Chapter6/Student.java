package Chapter6;

import java.util.ArrayList;

public class Student {
	int studentID;
	String studentName;
	ArrayList<Book> bookList;
	int index;
	
	public Student(int studentID,String studentName) {
		this.studentID=studentID;
		this.studentName=studentName;
		
		bookList = new ArrayList<Book>();
	}
	
	public void addBook(String title,String author) {
		Book book= new Book();
		
		book.setAuthor(author);
		book.setName(title);
		bookList.add(book);
	}
	
	public void showStudentInfo() {
		System.out.println(studentName+"학생이 읽은 책은 :");
		for(Book book:bookList) {
			System.out.print(book.getName());
		}
		System.out.println();
	}
}
