package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
	
		//메소드 소환이 안됨
//		Computer computer = new Computer();
		//묵시적형변환을 통한 추상클래스의 사용
		Computer computer = new Desktop();
		computer.display();
		//상위클래스에서의 호출 ->만약에 마음에 들지 않으면 오버라이딩 해서 사용한다.=>Desktop에서 바꾼후 사용 
		computer.turnOff();
		//항상 상위클래스를 내포하고 있다. 아래부분
		//Computer mynote= new MyNoteBook();
		//NoteBook mynote= new MyNoteBook();
		//final로 정의한 경우의 메소드는 재정의가 안된다.
	}

}
