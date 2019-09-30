package array;

public class BookArrayTest {

	public static void main(String[] args) {
		
		//배열의 공간 할당
		Book[] library = new Book[5];
		//값을 할당
		library[0] = new Book("태백산맥1","조정래");
		library[1] = new Book("태백산맥2","조정래");
		library[2] = new Book("태백산맥3","조정래");
		library[3] = new Book("태백산맥4","조정래");
		library[4] = new Book("태백산맥5","조정래");
		
		//상태확인
		for(int i=0;i<library.length;i++) {
			System.out.println(library[i]);
			//showBookInfo 메소드로 관련된 내용을 출력
			library[i].showBookInfo();
		}
		
	}

}
