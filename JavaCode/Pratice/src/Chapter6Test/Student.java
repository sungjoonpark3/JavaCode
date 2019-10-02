package Chapter6Test;

import java.util.ArrayList;

public class Student {
	int studentID;
	String studentName;
	ArrayList<Book> bookList;
	
	public Student(int studentID,String studentName) {
		this.studentID=studentID;
		this.studentName=studentName;
		
		bookList=new ArrayList<Book>();
	}
	
	public void addBook(String title,String author) {
		Book book = new Book();
		
		book.setAuthor(author);
		book.setBookName(title);
		bookList.add(book);
	}
	
	public void showStudentInfo() {
		System.out.println(studentName+"�л��� ���� å��");
		for(Book book:bookList) {
		System.out.print(book.getBookName()+","+book.getAuthor());			
		}
		System.out.println();
		
	}
}
