package abstractex;

public class Desktop extends Computer{
	
	public void display() {
		
		System.out.println("Desktop display");
	}
	public void typing() {
		System.out.println("Desktop typing");
	}
	@Override
	public void turnOff() {
		System.out.println("Desktop turn oFF");
	}

	//�߻�޼ҵ� 
	//�ΰ��� ����� �ִ�.
	//�Ϲ� Ŭ���� �տ� abstract�� �ٿ��� ����ϴ���
	//1�����
	//public abstract class Desktop extends Computer{
	//�߻�Ŭ������ ����� �߻� Ŭ������ �����ͼ� ����Ŭ������ �°� ���缭 ����� �� ������ �����Ѵ�.
	//2�����
	//	@Override
	//	public void display() {
	//		// TODO Auto-generated method stub
	//		
	//	}
	//
	//	@Override
	//	public void typing() {
	//		// TODO Auto-generated method stub
	//		
	//	}

}
