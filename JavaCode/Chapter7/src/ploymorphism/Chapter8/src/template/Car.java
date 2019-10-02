package template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();

	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {}
	
	//고정된 로직인 경우에 즉 틀이 되는 경우에는 재정의하면 안된다 따라서 앞에 final을 붙여준다.
	//시스템/메모리/로직 등에 final에 붙는다. 하위클래스에서 재정의 할 수없는 메소드 
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
