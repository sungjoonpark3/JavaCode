package template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();

	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	public void washCar() {}
	
	//������ ������ ��쿡 �� Ʋ�� �Ǵ� ��쿡�� �������ϸ� �ȵȴ� ���� �տ� final�� �ٿ��ش�.
	//�ý���/�޸�/���� � final�� �ٴ´�. ����Ŭ�������� ������ �� ������ �޼ҵ� 
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
