package gamelevel;

public class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("점프못하지롱");
		
	}

	@Override
	public void turn() {
		System.out.println("턴 못하지롱");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("******초급자레벨입니다.*********");
		
	}

	
}
