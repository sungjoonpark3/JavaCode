package abstractex;

public abstract class Computer {

//	public void display() {};//바디는 있지만 구현부가 구현되어 있지 않은 메소드 -추상클래스X
	public abstract void display();//추상메서드
	public abstract void typing();//추상메서드 위의 최종 클래스에 abstract를 추가해줘야 에러가 해결.
	
	//abstract의 사용이유
	//하위클래스에서 사용하기 위함 -단독으로의 사용 보다는 상위 클래스로 사용이 많이 되고,구현의 책임을 하위 클래스에게 위임해서 사용한다.
	// 상속받은 클래스가 구현하게 된다.
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
