package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
	
		//�޼ҵ� ��ȯ�� �ȵ�
//		Computer computer = new Computer();
		//����������ȯ�� ���� �߻�Ŭ������ ���
		Computer computer = new Desktop();
		computer.display();
		//����Ŭ���������� ȣ�� ->���࿡ ������ ���� ������ �������̵� �ؼ� ����Ѵ�.=>Desktop���� �ٲ��� ��� 
		computer.turnOff();
		//�׻� ����Ŭ������ �����ϰ� �ִ�. �Ʒ��κ�
		//Computer mynote= new MyNoteBook();
		//NoteBook mynote= new MyNoteBook();
		//final�� ������ ����� �޼ҵ�� �����ǰ� �ȵȴ�.
	}

}
