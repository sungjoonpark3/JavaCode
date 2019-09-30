package gamelevel;

public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("엄청빠르게  달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("아주높이 점프를 합니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("턴 합니다.");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*********고급자 레벨입니다.*********");
		
	}


}
