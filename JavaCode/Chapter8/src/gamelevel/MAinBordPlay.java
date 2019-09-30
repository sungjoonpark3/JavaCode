package gamelevel;

public class MAinBordPlay {

	public static void main(String[] args) {
		
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel alevel =  new AdvancedLevel();
		player.upgradeLevel(alevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}

}
