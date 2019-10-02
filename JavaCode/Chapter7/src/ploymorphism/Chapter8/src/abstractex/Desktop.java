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

	//추상메소드 
	//두가지 방법이 있다.
	//일반 클래스 앞에 abstract를 붙여서 사용하던지
	//1번방법
	//public abstract class Desktop extends Computer{
	//추상클래스에 선언된 추상 클래스를 가져와서 하위클래스에 맞게 맞춰서 사용을 할 것인지 선택한다.
	//2번방법
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
