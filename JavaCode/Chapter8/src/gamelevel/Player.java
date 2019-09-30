package gamelevel;

public class Player {
	
	//객체지향 프로그래밍이 X
	//	BeginnerLevel blevel;
	//	AdvancedLevel alevel;
	//	SuperLevel slevel;
	// 플레이어에 있는 모든 것들이 레벨에 상속됨
	private PlayerLevel level;
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
		
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level=level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
