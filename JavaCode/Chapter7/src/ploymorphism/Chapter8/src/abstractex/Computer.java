package abstractex;

public abstract class Computer {

//	public void display() {};//�ٵ�� ������ �����ΰ� �����Ǿ� ���� ���� �޼ҵ� -�߻�Ŭ����X
	public abstract void display();//�߻�޼���
	public abstract void typing();//�߻�޼��� ���� ���� Ŭ������ abstract�� �߰������ ������ �ذ�.
	
	//abstract�� �������
	//����Ŭ�������� ����ϱ� ���� -�ܵ������� ��� ���ٴ� ���� Ŭ������ ����� ���� �ǰ�,������ å���� ���� Ŭ�������� �����ؼ� ����Ѵ�.
	// ��ӹ��� Ŭ������ �����ϰ� �ȴ�.
	
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
