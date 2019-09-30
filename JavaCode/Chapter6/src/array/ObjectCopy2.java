package array;
//객체의 배열의 복사
public class ObjectCopy2 {
public static void main(String[] args) {
		
		//배열의 공간 할당
		Book[] library = new Book[5];
		Book[] copyLibaray = new Book[5];
		
		//값을 할당
		library[0] = new Book("태백산맥1","조정래");
		library[1] = new Book("태백산맥2","조정래");
		library[2] = new Book("태백산맥3","조정래");
		library[3] = new Book("태백산맥4","조정래");
		library[4] = new Book("태백산맥5","조정래");
		
		System.arraycopy(library,0,copyLibaray,0,5);
		
		//향상된 for문을 사용
//		for(Book book: copyLibaray) {
//			//책의 상태를 출력
//			book.showBookInfo();
//			
//		}
		//얕은복사구간
		library[0].setTitle("나목");
		library[0].setAuthor("박완서");
		
		for(Book book : library) {
			book.showBookInfo();
		}
		System.out.println("=============");
		
		for(Book book:copyLibaray) {
			book.showBookInfo();
		}
}
}
