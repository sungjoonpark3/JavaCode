package array;
//��ü�� �迭�� ����
public class ObjectCopy {
public static void main(String[] args) {
		
		//�迭�� ���� �Ҵ�
		Book[] library = new Book[5];
		Book[] copyLibaray = new Book[5];
		
		//���� �Ҵ�
		library[0] = new Book("�¹���1","������");
		library[1] = new Book("�¹���2","������");
		library[2] = new Book("�¹���3","������");
		library[3] = new Book("�¹���4","������");
		library[4] = new Book("�¹���5","������");
		
		copyLibaray[0] = new Book();
		copyLibaray[1] = new Book();
		copyLibaray[2] = new Book();
		copyLibaray[3] = new Book();
		copyLibaray[4] = new Book();
		
		//���� for���� ���
		for(int i =0; i<library.length;i++) {
			//å�� ���¸� ���
			copyLibaray[i].setTitle(library[i].getTitle());
			copyLibaray[i].setAuthor(library[i].getAuthor());
			}
		
		//�������籸��
		library[0].setTitle("����");
		library[0].setAuthor("�ڿϼ�");
		
		for(Book book : library) {
			book.showBookInfo();
		}
		System.out.println("=============");
		
		for(Book book:copyLibaray) {
			book.showBookInfo();
		}
}
}
